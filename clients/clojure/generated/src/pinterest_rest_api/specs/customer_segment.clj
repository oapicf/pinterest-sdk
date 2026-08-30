(ns pinterest-rest-api.specs.customer-segment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-template-status :refer :all]
            )
  (:import (java.io File)))


(def customer-segment-data
  {
   (ds/opt :ad_account_id) string?
   (ds/req :audience_ids) (s/coll-of string?)
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/req :name) string?
   (ds/opt :status) targeting-template-status-spec
   (ds/opt :updated_time) int?
   })

(def customer-segment-spec
  (ds/spec
    {:name ::customer-segment
     :spec customer-segment-data}))
