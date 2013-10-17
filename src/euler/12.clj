(ns euler.core)

(def triangles (lazy-cat [0] (map + triangles (iterate inc 1))))

(defn factors [n] (* 2 (count (filter #(zero? (rem n %)) (range 1 (Math/sqrt n))))))

(first (filter #(> (factors %) 500) triangles))
