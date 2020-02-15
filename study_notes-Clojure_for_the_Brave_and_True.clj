

(ns clojure-proj1.practice)

(defn error-msg
  [severity]
  (str " sth happened "
       (if (= severity :mild)
         " mildly annoyed"
         " not bad")))


(println (str "calling error-msg on not-:mild severity --> Produced: "
              (error-msg :heavy)))

(
  println (str "calling error-msg on :mild --> Produced: "
               (error-msg :mild))
  )


;-------------------------------------------------------------
; Data Structures
;-------------------------------------------------------------


;-------------------------------------------------------------
; nested map
;-------------------------------------------------------------
(def mapa {:name {:first "John" :middle "Jacob" :last "Doe"}})

(println (get (get mapa :name) :middle))

;-------------------------------------------------------------
; Vector
;-------------------------------------------------------------

(println (get [ 3 2 1] 2))

(def va (vector "a" "c" "1" 0))

(println va)

; note the conj used -- element is added @ the end of a vector
(print (conj va 88))


;-------------------------------------------------------------
; list -- similar to vector, but list uses nth not get function
;-------------------------------------------------------------

(def la '(:a :c :d :1))

(println (nth la 3))

; element is added to the beginning of a list
(println (conj la 88))



;-------------------------------------------------------------
; sets -- conj set no orders, or orders are not guaranteed
;-------------------------------------------------------------

(def sa #{ 3 8 1 10})

(println (conj sa 77))


(println (seq sa))
( println (rest sa))


;-------------------------------------------------------------
; functions --
;-------------------------------------------------------------

(defn x-chop
  "some chop ..."
  ([name chop-type] (str " the " chop-type " chop " name "!"
                      ))
  ([name]
   (x-chop name "karate"))
  )


(println  (x-chop "test" "55"))

;; "rest parameters  -- &"

(defn comm1
  [nm]
  (str "Get off my lawn, " nm "!\n"))

(defn comm1s
  [& nms]
  (map comm1 nms))

(println (comm1s "John" "Dan" "Xavier"))



;-------------------------------------------------------------
; Destructuring --  concisely BIND names to values
; within a colection
;-------------------------------------------------------------

(defn get-first
  [ [first-thing] ]
  first-thing)

(def _1stThing (get-first [ :a 1 :b 3 :d 10 ])
  )

( println _1stThing)


;-------------------------------------------------------------
; Clojure namespace
;-------------------------------------------------------------

(println (clojure.string/join ", " (list 3 2 1 10 5)))



;-------------------------------------------------------------
; Anonymous function (Lambda)
;-------------------------------------------------------------

(def v1 (map (fn [name] (str "Hi " name "!\n"))
             #{"Joe" "Dan" "Liu" "who?"}))

(println v1)






