(type #"regexp")

(re-matches #"\d" "There is no number here.")
(re-matches #"\d" "4")
(re-matches #"\d" "42")
(re-matches #"\d+" "42")

(re-find #"\d+" "42 is the ultimate answer.")
(re-seq #"\d+" "42 is the ultimate answer, and so is 52.")
