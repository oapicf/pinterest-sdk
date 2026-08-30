(ns pinterest-rest-api.specs.order-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-paid-type :refer :all]
            [pinterest-rest-api.specs.order-line-status :refer :all]
            )
  (:import (java.io File)))


(def order-line-data
  {
   (ds/req :ad_account_id) string?
   (ds/opt :budget) float?
   (ds/req :campaign_ids) (s/coll-of string?)
   (ds/opt :end_time) float?
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :paid_budget) float?
   (ds/opt :paid_type) order-line-paid-type-spec
   (ds/opt :purchase_order_id) string?
   (ds/opt :start_time) float?
   (ds/req :status) order-line-status-spec
   (ds/req :type) string?
   })

(def order-line-spec
  (ds/spec
    {:name ::order-line
     :spec order-line-data}))
