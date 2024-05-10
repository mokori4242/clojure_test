(require '[clojure.string :as str])
(str/replace "There    are     lots of   spaces" #"\s+" " ")
(str/split "There   are     lots of   spaces" #"\s+")
