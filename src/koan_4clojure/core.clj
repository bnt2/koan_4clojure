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
({[]})
(seq '(1))
(seq [1 2])
(seq "abc")
(seq [])
(seq )
(if nil "logical true" "logical false")
(if false "logical true" "logical true")
(if 0 "logical true" "logical false")
(if true "then branch")
(defn max_number [x y] 
  (if (x > y) x y))
(fn [& more] 
  (reduce
   (fn 
     [x y]
     (if (> x y) x y)
     )
   more))                
(fn [& coll]
  (reduce #(if (> %2 %1) %2 %1) coll))
; #57
(= (5 4 3 2 1) ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

((fn foo [x] (when (> x 0) (conj (foo (dec x)) x)))5)
(= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
   5)
(last (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (last))
(loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result))
((fn [% more] (conj % more)) * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
(fn [f & maps]
  (letfn [(step [m1 m2]
            (if (seq m2)
              (let [first-ele-in-m2 (first m2)
                    v-in-m1 (m1 (key first-ele-in-m2))]
                (if v-in-m1
                  (step
                    (assoc m1 (key first-ele-in-m2) (f v-in-m1 (val first-ele-in-m2)))
                    (rest m2))
                  (step
                    (assoc m1 (key first-ele-in-m2) (val first-ele-in-m2))
                    (rest m2))))
              m1))]
    (reduce step maps)))
(fn [str] (sort-by #(.toLowerCase %) (re-seq #"\w+" str)))
(fn [s]
  (sort-by #(.toLowerCase %)
    (re-seq #"[a-zA-Z]+" s)))
(map inc (take 3 (drop 2 [2 5 4 1 3 6])))
   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (reduce +))

#((get :a {:a nil :b 2}))
