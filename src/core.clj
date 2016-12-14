
(defn get-words [text] (re-seq #"\w+" text))
;(println (mapcat get-words  ["one two three four"]) )
;
;;(println (map inc [1 2 3 3 5 56]))
;;(println (map (partial * 2) [1 2 3 3 5 56]))
;
;(ns wordcount.core
;  (:require [wordcount.pages :refer :all]
;            [wordcount.words :refer :all]))
;
;; START:count-words-sequential
;(defn count-words-sequential [pages]
;  (frequencies (mapcat get-words pages)))
;; END:count-words-sequential
;
;; START:count-words-parallel
;(defn count-words-parallel [pages]
;  (reduce (partial merge-with +)
;          (pmap #(frequencies (get-words %)) pages)))
;; END:count-words-parallel
;
;; START:count-words
;(defn count-words [pages]
;  (reduce (partial merge-with +)
;          (pmap count-words-sequential (partition-all 100 pages))))
;; END:count-words
;
;(defn -main [& args]
;  (time (count-words (take 100000 (get-pages "enwiki.xml"))))
;  (shutdown-agents))

;(ns sum.core
;  (:require [clojure.core.reducers :as r])
;  )
;
;(defn recu-sum [numbers]
;  (if (empty? numbers) 0 (+ (first numbers) (recu-sum (rest numbers))))
;  )
;
;
;(defn reduce-sum [numbers]
;  (reduce (fn [acc x] (+ acc x)) 0 numbers)
;  )
;
;(defn rsum [numbers]
;  (reduce + numbers)
;  )
;
;(defn psum [numbers]
;  (r/fold + numbers)
;  )
;
(def numbers (into [] (range 0 1000000)))
;
;(println (time (reduce-sum numbers)))
;(println (time (reduce-sum numbers)))
;(println (time (reduce-sum numbers)))
;(println (time (reduce-sum numbers)))
;(println (time (reduce-sum numbers)))
;(println "")
;
;(println (time (rsum numbers)))
;(println (time (rsum numbers)))
;(println (time (rsum numbers)))
;(println (time (rsum numbers)))
;(println (time (rsum numbers)))
;(println "")
;
;(println (time (psum numbers)))
;(println (time (psum numbers)))
;(println (time (psum numbers)))
;(println (time (psum numbers)))
;(println (time (psum numbers)))

(println (take 10 (iterate inc 0)))
(println (take 10 (iterate (partial + 2) 0)))