#{1 2 3 4}
(type #{1 2 3 4})
(set? #{1 2 3 4})
#{1 2 3 4 4}
(def fruits #{"Apple" "Orange" "Mango" "Banana"})
(contains? fruits "Jack Fruit")
(fruits "Banana")
(fruits "Jack Fruit")
(def programming-languages #{:ruby 1 :python 2 :clojure 3})
(contains? programming-languages :ruby)
(programming-languages :ruby)
(:ruby programming-languages)
(conj programming-languages :perl)
(disj programming-languages :python)