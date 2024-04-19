(require '[clojure.spec.alpha :as s])
(def valid-person-vector? (s/cat :name string? :age number? :gender keyword?))
(s/valid? valid-person-vector? ["Karthik" 40 :male])
(s/valid? valid-person-vector? ["Karthik" 40 "male"])
(def valid-person-map?
  (s/keys :req-un [::name
                   ::age
                   ::gender]))
(s/valid? valid-person-map? {:name "Karthik"
                             :age 40
                             :gender :male
                             })
