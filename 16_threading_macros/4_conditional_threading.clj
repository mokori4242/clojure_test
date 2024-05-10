(let [a 11]
  (cond-> []
    (odd? a) (conj (* a 2))
    (even? a) (conj (/ a 2))))

