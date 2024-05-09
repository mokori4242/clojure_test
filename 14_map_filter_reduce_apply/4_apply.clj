(+ 1 2 3 4)
(apply + [1 2 3 4])
(apply + '(1 2 3 4))
(defn my-function [arg1 arg2]
  (println "Argument 1:" arg1)
  (println "Argument 2:" arg2))
(apply my-function ["one" "two"])
(my-function ["one" "two"]) ;; エラー
