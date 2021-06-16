(ns koan-4clojure.core
  (:gen-class))

(= "HELLO WORLD"(.toUpperCase "hello world"))
(list :a :b :c)
'(:a :b :c)
(= (list :a :b :c) '(:a :b :c))
(conj '(2 3 4) 1)

(list :a :b :c)
(set '(:a :a :b :c :c :c :c :d :d))
(clojure.set/union #{:a :b :c} #{:b :c :d})
#{1 2 3 4}
(conj #{1 4 3} 2)
((hash-map :a 10, :b 20, :c 30) :b)
(:b {:a 10, :b 20, :c 30})
{:a 1, :b 2, :c 3}
 (conj {:a 1})
(rest [10 20 30 40])
((fn add-five [x] (+ x 5)) 3)
((fn double-it [x] (* x 2)) 4)
(str "Hello" "Dave")
(fn [b] (if (map  (=! b (b-1)))))

Write a function which replicates each element of a sequence a variable number of times.
(fn [b t] (mapcat #(repeat t %)b))
#(first (take-last 1 %))

Write a function which packs consecutive duplicates into sub-lists.(partition-by identity [1 2 3] 2)


; #36 Can you bind x, y, and z so that these are all true?

(= 4 (let [y 3 z 1]  (+ y z)))
(= 10 (let [x 7 y 3] (+ x y)))
#_ [x 7 y 3 z 1]

[1 2 3]


(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

Write a function which takes a variable number of parameters and returns the maximum value.
(= ( 1 8 3 4) 8)
(= (__ 30 20) 30)
(= (__ 45 67 11) 67)
(reduce + [1 2 3 4 5])
(reduce + 6 [2 3])
