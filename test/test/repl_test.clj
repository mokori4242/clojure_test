(ns test.repl-test
    (:require [clojure.test :refer :all]
             [test.repl :refer :all]))

(deftest testing-repl-test
  (is (= "Hello repl!" (testing-repl))))
