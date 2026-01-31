(ns pinterest-rest-api.specs.quiz-pin-question
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.quiz-pin-option :refer :all]
            )
  (:import (java.io File)))


(def quiz-pin-question-data
  {
   (ds/opt :options) (s/coll-of quiz-pin-option-spec)
   (ds/opt :question_id) float?
   (ds/opt :question_text) string?
   })

(def quiz-pin-question-spec
  (ds/spec
    {:name ::quiz-pin-question
     :spec quiz-pin-question-data}))
