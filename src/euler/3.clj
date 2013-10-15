(ns euler.core)

(defn factors [n]
  (filter #(empty? (factors %)) (filter #(zero? (rem n %)) (range 2 n))))


(factors 600851475143)
