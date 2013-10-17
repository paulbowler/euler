(ns euler.core)

(def triangles (lazy-cat [0] (map + triangles (iterate inc 1))))

(take-while #(< % 100) triangles)
