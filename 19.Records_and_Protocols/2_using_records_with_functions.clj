(defrecord Car [name top-speed])
(def tata-nano (->Car "Tata Nano" 120))
(defn describe [vehicle]
  (let [{name :name top-speed :top-speed} vehicle]
    (str name " has a top speed of " top-speed "Km/hr.")))
(describe tata-nano)
