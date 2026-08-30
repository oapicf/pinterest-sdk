(ns pinterest-rest-api.specs.customer-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.customer-list-status :refer :all]
            )
  (:import (java.io File)))


(def customer-list-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :created_time) float?
   (ds/opt :exceptions) any?
   (ds/req :id) string?
   (ds/opt :is_nca) boolean?
   (ds/req :name) string?
   (ds/opt :num_batches) float?
   (ds/opt :num_removed_user_records) float?
   (ds/opt :num_uploaded_user_records) float?
   (ds/opt :status) customer-list-status-spec
   (ds/opt :type) string?
   (ds/opt :updated_time) float?
   })

(def customer-list-spec
  (ds/spec
    {:name ::customer-list
     :spec customer-list-data}))
