(ns dynamicattractor.core
  (:require [caribou.app :as caribou]))

(defn init
  [] )

(defn run-app
  []
  (caribou/run-api 22111)
  (caribou/run-pages 22333))

(defn -main []
  (run-app))