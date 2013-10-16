(ns euler.core)

(first
  (for [a (range 1 998)
        b (range 1 998)
        c (range 1 998)
        :when
          (and
            (= 1000 (+ a b c))
            (= (* c c) (+ (* a a) (* b b))))]
    (* a b c)))
