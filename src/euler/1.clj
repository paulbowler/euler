(ns euler.core)

(reduce + (filter #(or (= 0 (rem % 3)) (= 0 (rem % 5))) (range 1 1000)))
