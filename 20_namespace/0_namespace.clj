;; name_space.clj

(ns lawyer)

(def about-me "I never speak truth.")

(ns politician)

(def about-me "I loot the nation.")

(ns engineer)

(def about-me "I apply science.")

(println lawyer/about-me)
(println politician/about-me)
(println about-me)

(ns politician)

(println about-me)
