(require '[clojure.test :refer [deftest is testing]])
(load-file "21_Testing/testing.clj")
(deftest testing_test
    (testing "testing_test")
        (testing "add")
            (is (= 5 (add 2 2)) "2同士を足すと4になるテスト")
            (is (= 0 (add 2 -2)) "正負の数を足すと0になるテスト")
        (testing "sub")
            (is (= 0 (sub 2 2)) "2同士を引くと0になるテスト")
            (is (= 4 (sub 2 -2)) "正負の数を引くと4になるテスト"))

(testing_test)