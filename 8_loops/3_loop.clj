(loop [x 1]
  (when (<= x 5)
    (println x)
    (recur (inc x))))
