;; (def people ["Rehmaan" "Kalaam"])

(let [[musician scientist] people]
  (println "Musician is" musician)
  (println "Scientist is" scientist))

(let [[musician scientist artist] people]
  (println "Musician is" musician)
  (println "Scientist is" scientist)
  (println "Artist is" artist))

(def people ["Rehmaan" "Kalaam" "Hussein" "Madhavan"])

(let [[musician scientist artist] people]
  (println "Musician is" musician)
  (println "Scientist is" scientist)
  (println "Artist is" artist))

(let [[_ scientist _ actor] people]
  (println "Scientist is" scientist)
  (println "Actor is" actor))

(def people2 `("Rehmaan" "Kalaam" "Hussein" "Madhavan"))
(let [[_ scientist _ actor] people2]
  (println "Scientist is" scientist)
  (println "Actor is" actor))

(def people3
  {:musician "Rehmaan"
   :scientist "Kalaam"
   :artist "Hussein"
   :actor "Madhavan"})

(let [{scientist :actor actor :musician} people3]
  (println "Scientist is" scientist)
  (println "Actor is" actor))