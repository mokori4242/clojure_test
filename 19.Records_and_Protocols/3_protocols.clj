(defprotocol Describe
  (describe [this]))
(defrecord Car [name top-speed]
  Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name " has a top speed of " top-speed "Km/hr."))))
(def tata-nano (->Car "Tata Nano" 120))
(describe tata-nano)


(defrecord Ship [name top-speed]
  Describe
  (describe [this]
    (let [{name :name top-speed :top-speed} this]
      (str name " has a top speed of " top-speed " knots."))))
(def arctic-explorer (->Ship "Arctic Explorer" 10))
(describe arctic-explorer)

(defrecord Rocket [name orbit])
(extend-protocol Describe
  Rocket
  (describe [this] (str (:name this) " reaches " (:orbit this) " orbit.")))
(def pslv (->Rocket "PSLV" "Low Earth"))
(describe pslv)



