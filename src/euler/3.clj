(ns euler.core)

(defn factors [n]
  (filter #(empty? (factors %)) (filter #(zero? (rem n %)) (range n 2 -1))))


(first (factors 600851475143))
