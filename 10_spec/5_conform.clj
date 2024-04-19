(require '[clojure.spec.alpha :as s])
(s/conform number? 42)
(s/conform number? "42")
