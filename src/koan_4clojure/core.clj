(ns koan-4clojure.core
  (:gen-class))

; #36 Can you bind x, y, and z so that these are all true?

(= 4 (let [y 3 z 1]  (+ y z)))
(= 10 (let [x 7 y 3] (+ x y)))
#_ [x 7 y 3 z 1]
