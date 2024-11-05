(ns pinterest-rest-api.specs.lead-form-question
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-question-type :refer :all]
            [pinterest-rest-api.specs.lead-form-question-field-type :refer :all]
            )
  (:import (java.io File)))


(def lead-form-question-data
  {
   (ds/opt :question_type) lead-form-question-type-spec
   (ds/opt :custom_question_field_type) lead-form-question-field-type-spec
   (ds/opt :custom_question_label) string?
   (ds/opt :custom_question_options) (s/coll-of string?)
   })

(def lead-form-question-spec
  (ds/spec
    {:name ::lead-form-question
     :spec lead-form-question-data}))
