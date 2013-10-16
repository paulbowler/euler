(ns euler.core)

; After trying (and failing) to find a solution using brute-force factorisations I found
; a simpler mathematical solution using greatest common divisor here:
;
;   http://en.wikipedia.org/wiki/Least_common_multiple#Reduction_by_the_greatest_common_divisor
;
; Essentially: lcm(a,b) = (a*b)/gcd(a,b) which can then be reduced over range 1..20

(defn gcd [a b] (if (zero? b) a (recur b (mod a b))))
(defn lcm [a b] (/ (* a b) (gcd a b)))

(reduce #(lcm %1 %2) (range 1 21))
