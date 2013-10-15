(ns euler.core)

(first
 (sort >
       (for [x (range 999 100 -1)
             y (range 999 100 -1)
          :let [t (* x y)]
          :when (= (str t) (apply str (reverse (str t))))]
          t)))
