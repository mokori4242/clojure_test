(ns test.core
  (:gen-class)
  (:require [test.decorator :as d]
            [hiccup.core :as h]))

(defn print-to-console [name]
  (d/print-stars)
  (println (str "Hello " name "!"))
  (d/print-stars))

(defn print-to-html [name]
  (spit "index.html"
        (h/html
         [:html
          [:head
           [:title "Hello"]]
          [:body
           [:h1 (str "Hello " name "!")]
           [:div {:id "email" :class "selected starred"} "..."]
           [:div#email.selected.starred "..."]]])))

(defn -main
  "I don't do a whole lot."
  [& args]
  (if (= "--html" (second args))
    (print-to-html (first args))
    (print-to-console (first args))))

