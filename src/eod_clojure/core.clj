(ns eod-clojure.core
  (:gen-class))

(require '[clojure.java.jdbc :as sql]
         '[clojure.java.jdbc.sql :as dsl])


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def db {:classname "oracle.jdbc.driver.OracleDriver"
           :subprotocol "oracle"
           :subname "thin:@192.168.1.51:1521:AGS8XQA"
           :user "GRAINCORP_APP_7072"
           :password "GRAINCORP_APP_7072"
           :defaultRowPrefetch 1000
           }
    )
  (sql/with-connection db 
    (sql/with-query-results res ["select internal_contract_ref_no from pcm_physical_contract_main"] (println res)))
  )
