(ns euler.core)

(apply max
       (for [x (range 100 999)
             y (range 100 999)
          :let [t (* x y)]
          :when (= (str t) (apply str (reverse (str t))))]
          t))
