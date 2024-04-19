(require '[clojure.spec.alpha :as s])
(s/def ::name string?)
(s/def ::age int?)
(s/def ::gender keyword?)
(s/def ::person (s/keys :req-un [::name ::age ::gender]))
(s/valid? ::person {:name "Karthik"
                    :age 40
                    :gender :male})
(s/valid? ::person {:name "Karthik"
                    :age 40
                    :gender "male"})
