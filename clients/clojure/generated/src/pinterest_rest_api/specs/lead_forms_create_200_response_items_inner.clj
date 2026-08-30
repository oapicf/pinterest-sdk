(ns pinterest-rest-api.specs.lead-forms-create-200-response-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form :refer :all]
            [pinterest-rest-api.specs.pinterest/lib/batch-item-exception :refer :all]
            )
  (:import (java.io File)))


(def lead-forms-create-200-response-items-inner-data
  {
   (ds/opt :data) lead-form-spec
   (ds/opt :exceptions) (s/coll-of pinterest/lib/batch-item-exception-spec)
   })

(def lead-forms-create-200-response-items-inner-spec
  (ds/spec
    {:name ::lead-forms-create-200-response-items-inner
     :spec lead-forms-create-200-response-items-inner-data}))
