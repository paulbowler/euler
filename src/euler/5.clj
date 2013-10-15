(ns euler.core)

(defn factors [n]
  (sorted-set (filter #(= 0 (rem n %)) (range 1 n))))

(factors 2520)

(reduce * (range 1 21))

(* 2 3 5 7 11 13 17 19)

(* 20 19 17 13 11 7 5 3 2)

