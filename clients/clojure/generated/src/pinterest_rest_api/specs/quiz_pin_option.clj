(ns pinterest-rest-api.specs.quiz-pin-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quiz-pin-option-data
  {
   (ds/opt :id) float?
   (ds/opt :text) string?
   })

(def quiz-pin-option-spec
  (ds/spec
    {:name ::quiz-pin-option
     :spec quiz-pin-option-data}))
