(ns euler.core)

; We can reuse the prime factor code from Q3 for an (inefficient) solution

(defn largest-prime-factor
  ([n] (largest-prime-factor n 2))
  ([n d]
   (if (> d n)
     (dec d)
     (recur
      (#(if (zero? (rem % d))
          (recur (/ % d))
          %)
        n)
      (inc d)))))

(defn prime? [n]
  (= n (largest-prime-factor n)))

(reduce + (filter prime? (range 2 2000000)))
