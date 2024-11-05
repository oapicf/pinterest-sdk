(ns pinterest-rest-api.specs.lead-form-array-response-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-response :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def lead-form-array-response-items-inner-data
  {
   (ds/opt :data) lead-form-response-spec
   (ds/opt :exceptions) (s/coll-of exception-spec)
   })

(def lead-form-array-response-items-inner-spec
  (ds/spec
    {:name ::lead-form-array-response-items-inner
     :spec lead-form-array-response-items-inner-data}))
