(ns pinterest-rest-api.specs.order-lines
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-paid-type :refer :all]
            [pinterest-rest-api.specs.order-line-status :refer :all]
            )
  (:import (java.io File)))


(def order-lines-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :budget) float?
   (ds/opt :end_time) float?
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :paid_budget) float?
   (ds/opt :paid_type) order-line-paid-type-spec
   (ds/opt :purchase_order_id) string?
   (ds/opt :start_time) float?
   (ds/opt :status) order-line-status-spec
   (ds/opt :type) string?
   })

(def order-lines-spec
  (ds/spec
    {:name ::order-lines
     :spec order-lines-data}))
