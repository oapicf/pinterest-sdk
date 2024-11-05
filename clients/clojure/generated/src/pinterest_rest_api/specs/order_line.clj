(ns pinterest-rest-api.specs.order-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-status :refer :all]
            [pinterest-rest-api.specs.order-line-paid-type :refer :all]
            )
  (:import (java.io File)))


(def order-line-data
  {
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :purchase_order_id) string?
   (ds/opt :start_time) float?
   (ds/opt :end_time) float?
   (ds/opt :budget) float?
   (ds/opt :paid_budget) float?
   (ds/opt :status) order-line-status-spec
   (ds/opt :name) string?
   (ds/opt :paid_type) order-line-paid-type-spec
   (ds/req :campaign_ids) (s/coll-of string?)
   })

(def order-line-spec
  (ds/spec
    {:name ::order-line
     :spec order-line-data}))
