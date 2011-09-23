(in-ns 'triface.app.controller)

(defn action [params]
  (merge params {:result (str "OOPYO --- ***" (params :yoyo))}))