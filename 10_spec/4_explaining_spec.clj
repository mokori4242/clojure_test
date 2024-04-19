(require '[clojure.spec.alpha :as s])
(s/explain number? "42")
(s/explain number? 42)
