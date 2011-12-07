(ns dynamicattractor.core
  (:use caribou.debug)
  (:require [caribou.app :as caribou]
            [caribou.app.controller :as controller]
            [dynamicattractor.controller]))

(defn init
  [] )

(defn run-app
  []
  (debug @controller/controllers)
  (caribou/run-api 22111)
  (caribou/run-pages 22333))

(defn -main []
  (run-app))