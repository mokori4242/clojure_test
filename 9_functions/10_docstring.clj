(defn sum
  "Adds two numbers passed as arguments.

   The arguments should be numbers.
   # test!!!
   - テスト〜〜〜！！
   **Usage**

   ```clojure
   (sum 4 5) ;; returns 9
   ```
  "
  [a b]
  {:pre [(number? a) (number? b)]}
  (+ a b))

(println (sum 4 5))