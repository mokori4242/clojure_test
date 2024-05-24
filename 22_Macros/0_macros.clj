(+ 2 3)
(type '(+ 2 3))

(defmacro calculate [a-list]
  (list ; (2 + 3) を (+ 2 3) に変換します
   (second a-list)
   (first a-list)
   (last a-list)))

(println
 (calculate (2 + 3)))

(println
 (macroexpand
  '(calculate (2 + 3))))

(defmacro with-log [form]
  (list 'do
        (list 'println "Start")
        form
        (list 'println "End")))

(with-log (+ 1 3))
(macroexpand '(with-log (+ 1 1)))

(quote (println "Hello"))
'(println "Hello")

(defmacro with-log [form]
  `(do (println "Start") ~form (println "End")))
(with-log (println "Hello"))

(defmacro calculate [a-list]
  `(+
    ~(first a-list)
    ~(last a-list)))
(println
 (calculate (2 + 3)))

(println
 (macroexpand
  '(calculate (2 + 3))))