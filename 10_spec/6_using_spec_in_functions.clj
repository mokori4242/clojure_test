(require '[clojure.spec.alpha :as s])
(defn add-two-numbers [a b]
  {:pre [(s/valid? number? a)
         (s/valid? number? b)]}
  (+ a b))
(add-two-numbers 3 5)
(add-two-numbers 3 "5")