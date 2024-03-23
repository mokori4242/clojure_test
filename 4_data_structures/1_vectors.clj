[1 2 3 4] ; a very simple vector
(vector 1 2 3)
[1 true "Bashir"] ; vector containing multiple data types
(def friends
  ["Ram" "Bashir" "Antony" "Buddha"])
(println friends)
(first friends)
(rest friends)
(type friends)
(type (rest friends))
(nth friends 3)
(nth friends 0)
(friends 3)
(conj friends "Periyaar")
(println friends)
(friends 3)
(cons "Periyaar" friends)
(count friends)
(friends 42)