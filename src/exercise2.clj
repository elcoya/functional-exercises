(ns exercise2)

(defn only-greater-than-five
    [input]
    (filter (fn [x]
        (> x 5))
        input
    )
)