(defn sum [a b]
  {:pre [(number? a) (number? b)]}
  (+ a b))

(println (sum 4 5))
(println (sum "4" 5)) ;; エラーが発生します

(defn sum [a b]
  {:post [(number? %)]}
  "45")

(defn sum-without-post [a b]
  "45")

(println (sum-without-post 4 5))
(println (sum 4 5)) ;; アサーション失敗: (number? %)

(defn sum [a b]
  {:pre [(number? a) (number? b)]
   :post [(number? %)]}
  (+ a b))

(println (sum 4 5))