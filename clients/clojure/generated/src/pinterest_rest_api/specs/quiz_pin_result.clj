(ns pinterest-rest-api.specs.quiz-pin-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quiz-pin-result-data
  {
   (ds/opt :organic_pin_id) string?
   (ds/opt :android_deep_link) string?
   (ds/opt :ios_deep_link) string?
   (ds/opt :destination_url) string?
   (ds/opt :result_id) float?
   })

(def quiz-pin-result-spec
  (ds/spec
    {:name ::quiz-pin-result
     :spec quiz-pin-result-data}))
