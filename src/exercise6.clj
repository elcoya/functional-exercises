(ns exercise6)

(defn faverage [values]
    (if (= (count values) 0)
        0
        (/ (reduce + values) (count values))
    )
)
