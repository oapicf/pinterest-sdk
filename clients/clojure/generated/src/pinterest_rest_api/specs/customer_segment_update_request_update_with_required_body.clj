(ns pinterest-rest-api.specs.customer-segment-update-request-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-update-operation-type :refer :all]
            )
  (:import (java.io File)))


(def customer-segment-update-request-update-with-required-body-data
  {
   (ds/opt :audience_ids) (s/coll-of string?)
   (ds/req :id) string?
   (ds/req :operation_type) audience-update-operation-type-spec
   })

(def customer-segment-update-request-update-with-required-body-spec
  (ds/spec
    {:name ::customer-segment-update-request-update-with-required-body
     :spec customer-segment-update-request-update-with-required-body-data}))
