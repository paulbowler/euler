(ns euler.core)

(reduce + (filter even? (take-while #(< % 4000000) (map first (iterate (fn [[a b]] [b (+ a b)]) [1 2])))))

(->> (iterate (fn [[a b]] [b (+ a b)]) [1 2])
     (map first)
     (take-while #(< % 4000000))
     (filter even?)
     (reduce +))
