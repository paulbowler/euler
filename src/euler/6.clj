(ns euler.core)

(def r (range 1 101))
(def sqr-sum (reduce + (map #(* % %) r)))
(def rng-sum (reduce + r))

(- (* rng-sum rng-sum) sqr-sum)
