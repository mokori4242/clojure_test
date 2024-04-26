(def all-numbers (iterate inc 1))
(nth all-numbers 24)
(take 10 all-numbers)
(defn squared [num]
  (Math/pow num, 2))
(def squares (iterate squared 5))
(take 3 squares)

