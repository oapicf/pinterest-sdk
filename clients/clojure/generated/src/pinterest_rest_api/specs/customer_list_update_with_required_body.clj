(ns pinterest-rest-api.specs.customer-list-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-list-operation-type :refer :all]
            [pinterest-rest-api.specs.customer-list-record-row :refer :all]
            )
  (:import (java.io File)))


(def customer-list-update-with-required-body-data
  {
   (ds/req :operation_type) user-list-operation-type-spec
   (ds/opt :records) string?
   (ds/opt :records_v2) (s/coll-of customer-list-record-row-spec)
   })

(def customer-list-update-with-required-body-spec
  (ds/spec
    {:name ::customer-list-update-with-required-body
     :spec customer-list-update-with-required-body-data}))
