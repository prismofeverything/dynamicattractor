(in-ns 'triface.app.controller)

(defn action [params]
  (merge params {:result (str (params :yoyo) " ---- FFFFFd OOOOOOOOOOOOOO ddddddddk KKK x ---" (params :pipi))}))