(ns test.core
  (:gen-class)
  (:require [test.decorator :as d]))

(defn -main
  "I don't do a whole lot."
  [& args]
  (d/print-stars)
  (println (str "Hello " (first args) "!"))
  (d/print-stars))

