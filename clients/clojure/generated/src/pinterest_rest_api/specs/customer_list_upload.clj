(ns pinterest-rest-api.specs.customer-list-upload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.error-detail :refer :all]
            [pinterest-rest-api.specs.user-list-operation-type :refer :all]
            [pinterest-rest-api.specs.record-counts :refer :all]
            )
  (:import (java.io File)))


(def customer-list-upload-data
  {
   (ds/req :ad_account_id) string?
   (ds/req :creation_time) int?
   (ds/req :customer_list_id) string?
   (ds/opt :error_counts) (s/coll-of error-detail-spec)
   (ds/req :id) string?
   (ds/req :operation) user-list-operation-type-spec
   (ds/opt :record_counts) record-counts-spec
   (ds/req :state) string?
   (ds/req :updated_time) int?
   })

(def customer-list-upload-spec
  (ds/spec
    {:name ::customer-list-upload
     :spec customer-list-upload-data}))
