(ns pinterest-rest-api.specs.customer-segment-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.customer-segment :refer :all]
            )
  (:import (java.io File)))


(def customer-segment-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of customer-segment-spec)
   })

(def customer-segment-list-200-response-spec
  (ds/spec
    {:name ::customer-segment-list-200-response
     :spec customer-segment-list-200-response-data}))
