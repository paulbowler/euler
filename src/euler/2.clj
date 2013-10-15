(ns euler.core)

(reduce + (filter even? (take-while #(< % 4000000) (map first (iterate (fn [[a b]] [b (+ a b)]) [1 2])))))
