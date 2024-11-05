(ns pinterest-rest-api.specs.lead-form-question-field-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-question-field-type-data
  {
   })

(def lead-form-question-field-type-spec
  (ds/spec
    {:name ::lead-form-question-field-type
     :spec lead-form-question-field-type-data}))
