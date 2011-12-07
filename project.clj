(defproject dynamicattractor "0.1.0-SNAPSHOT"
  :description "dynamic attractor"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.freemarker/freemarker "2.3.18"]
                 [antler/caribou "0.3.0-SNAPSHOT"]]
  :dev-dependencies [[lein-ring "0.4.5"]
                     [clojure-source "1.3.0"]
                     [swank-clojure "1.4.0-SNAPSHOT"]]
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :main dynamicattractor.core
  :ring {:handler dynamicattractor.core/run-app
         :servlet-name "dynamicattractor"
         :init dynamicattractor.core/init}
)