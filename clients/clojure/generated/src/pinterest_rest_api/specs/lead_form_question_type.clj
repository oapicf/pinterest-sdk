(ns pinterest-rest-api.specs.lead-form-question-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-question-type-data
  {
   })

(def lead-form-question-type-spec
  (ds/spec
    {:name ::lead-form-question-type
     :spec lead-form-question-type-data}))
