(ns pinterest-rest-api.specs.quiz-pin-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.quiz-pin-question :refer :all]
            [pinterest-rest-api.specs.quiz-pin-result :refer :all]
            [pinterest-rest-api.specs.quiz-pin-result :refer :all]
            )
  (:import (java.io File)))


(def quiz-pin-data-data
  {
   (ds/opt :questions) (s/coll-of quiz-pin-question-spec)
   (ds/opt :results) (s/coll-of quiz-pin-result-spec)
   (ds/opt :tie_breaker_type) string?
   (ds/opt :tie_breaker_custom_result) quiz-pin-result-spec
   })

(def quiz-pin-data-spec
  (ds/spec
    {:name ::quiz-pin-data
     :spec quiz-pin-data-data}))
