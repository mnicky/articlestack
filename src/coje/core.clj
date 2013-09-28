(ns coje.core)

(def saved (atom :initial_value))

(defn default-web-handler
  ""
  [req]
  {:status 200
   :headers {}
   :body (pr-str @saved)})
