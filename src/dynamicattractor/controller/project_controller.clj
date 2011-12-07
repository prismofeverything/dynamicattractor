(ns dynamicattractor.controller.project-controller
  (:use 'caribou.app.controller))

(controller :project
  :index (fn [params] params)
  :detail (fn [params] params))



