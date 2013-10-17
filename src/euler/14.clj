(ns euler.core)

(defn collatz
  ([n] (collatz n n 1))
  ([n o i]
   (if (= n 1)
     [o i]
     (if (even? n)
       (recur (/ n 2) o (inc i))
       (recur (+ (* 3 n) 1) o (inc i))))))

(last (sort-by #(last %) (map #(collatz %) (range 1 1000000))))
