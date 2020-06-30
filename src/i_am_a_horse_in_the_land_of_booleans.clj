(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (max x (- x)))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 5))  "buzz"
    (= 0 (mod n 3))  "fizz"
    :else            ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (vector? x) (* (count x) 2)
    (list? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (or (and (= 0 (mod year 4)) (not (= 0 (mod year 100)))) (= 0 (mod year 400))))

; '_______'
