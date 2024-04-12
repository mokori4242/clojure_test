(defn count-down [number]
  (println number)
  (if (pos? (dec number))
    (count-down (dec number))))
(count-down 5)
(defn sum [numbers total]
  (if (empty? numbers)
    total
    (recur (rest numbers) (+ total (first numbers)))))
(println (sum [1 2 3 4 5], 0))
(defn sum [numbers total]
  (if (empty? numbers)
    total
    (recur (rest numbers) (+ total (first numbers)))))
(defn collection-sum [collection]
  (sum collection 0))
(println (collection-sum [1 2 3 4 5]))

