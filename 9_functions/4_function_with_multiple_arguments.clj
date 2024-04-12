(defn multiple-args
  ([] (println "No arguments passed"))
  ([arg-1] (println "One argument passed:" arg-1))
  ([arg-1 arg-2] (println "Two arguments passed:" arg-1 arg-2)))

(multiple-args 1)
(multiple-args 1 2)
(multiple-args)
