(fn [s]
  (sort-by #(.toLowerCase %)
    (re-seq #"[a-zA-Z]+" s)))


