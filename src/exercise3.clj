(ns exercise3)


(defn fibonatural [x]
    "Only for x > 0"
    (if (< x 3)
        1
        (+ (fibonatural (- x 1)) (fibonatural (- x 2)))
    )
)

(defn fibonacci
    [x]
    (if (= x 0)
        0
        (fibonatural x)
    )
)