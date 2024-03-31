(let [a 5]
  (if (> a 0)
    (println a "is positive")))
(let [a -5]
  (if (> a 0)
    (println a "is positive")))
(let [a 5]
  (if (> a 0)

    (do
      (println a "is positive")
      (println "There are infinite positive numbers"))

    (do
      (println a "is negative")
      (println "There are infinite negative numbers"))))