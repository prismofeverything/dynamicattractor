(ns dynamicattractor.controller.project-controller
  (:use caribou.app.controller))

(controller :project
  :index (fn [request] (assoc request :yellow 55555))
  :detail (fn [request] (assoc request :bbbbb "yoyoyoyoyo")))


