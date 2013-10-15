(ns euler.core)

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

(largest-prime-factor 600851475143)
