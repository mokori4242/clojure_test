(require '[clojure.spec.alpha :as s])
(s/valid? string? "Hello")
(s/valid? number? 42)
(s/valid? integer? 123)
(s/valid? double? 123.45)
(s/valid? vector? [1 2 3])
(s/valid? map? {1 "one" 2 "two"})
(s/valid? set? #{:apple :orange})
(s/valid? keyword? :ubuntu)
(def string-or-keyword? (s/or :string string? :keyword keyword?))
(s/valid? string-or-keyword? "abc") ;; true
(s/valid? string-or-keyword? :abc) ;; true
(s/valid? string-or-keyword? 42) ;; false
