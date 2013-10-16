(ns euler.core)


(defn gcd [a b] (if (zero? b) a (recur b (mod a b))))
(defn lcm [a b] (/ (* a b) (gcd a b)))

(reduce #(lcm %1 %2) (range 1 21))
