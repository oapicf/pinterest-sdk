(ns pinterest-rest-api.specs.lead-form-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-array-response-items-inner :refer :all]
            )
  (:import (java.io File)))


(def lead-form-array-response-data
  {
   (ds/opt :items) (s/coll-of lead-form-array-response-items-inner-spec)
   })

(def lead-form-array-response-spec
  (ds/spec
    {:name ::lead-form-array-response
     :spec lead-form-array-response-data}))
