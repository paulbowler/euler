(ns euler.core)

(defn primes [n]
      (loop [res '() lst (cons 2 (range 3 n 2))]
         (if (>= (* (first lst) (first lst)) n) (concat (reverse res) lst)
            (recur (cons (first lst) res) (doall (remove #(zero? (mod % (first lst))) lst))))))

(reduce + (primes 2000000))
