(defn multiplier [multiply-with]
  (fn [number]
    (* number multiply-with)))

(def double-it
  (multiplier 2))

(def triple-it
  (multiplier 3))

(double-it 21)

(triple-it 14)