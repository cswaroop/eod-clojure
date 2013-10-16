(defproject eod-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"]
                 [local/ojdbc6 "11.2.0.3"]
                 ]
  :resource-paths ["lib/ojdbc6.jar"]
  :main eod-clojure.core)


; mvn install:install-file -X -DgroupId=local -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=/opt/oracle/instantclient/ojdbc6.jar -DgeneratePom=true
