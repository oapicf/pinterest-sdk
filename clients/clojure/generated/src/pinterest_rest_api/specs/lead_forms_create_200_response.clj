(ns pinterest-rest-api.specs.lead-forms-create-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-forms-create-200-response-items-inner :refer :all]
            )
  (:import (java.io File)))


(def lead-forms-create-200-response-data
  {
   (ds/req :items) (s/coll-of lead-forms-create-200-response-items-inner-spec)
   })

(def lead-forms-create-200-response-spec
  (ds/spec
    {:name ::lead-forms-create-200-response
     :spec lead-forms-create-200-response-data}))
