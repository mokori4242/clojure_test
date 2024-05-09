(map inc [1 2 3])
(map (fn [x] (+ x 1)) [1 2 3])
(map #(+ % 1) [1 2 3])
(map (fn [x y]
       (+ (Math/pow x 2)
          (Math/pow y 2))) [1 2 3] [2 3 4])