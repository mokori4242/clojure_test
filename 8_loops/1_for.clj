(let [nums [1 2 3 4]]
  (for [num nums]
    (* num 10)))
(def colors ["red" "blue" "green" "yellow"])

(def shapes ["square" "circle" "triangle" "rectangle"])

(for [color colors
      shape shapes]
  (str color " " shape))

