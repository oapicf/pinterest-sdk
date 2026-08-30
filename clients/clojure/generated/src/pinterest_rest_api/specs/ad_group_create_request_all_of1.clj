(ns pinterest-rest-api.specs.ad-group-create-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.budget-type :refer :all]
            [pinterest-rest-api.specs.pacing-delivery-type :refer :all]
            )
  (:import (java.io File)))


(def ad-group-create-request-all-of1-data
  {
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :bid_multiplier) float?
   (ds/opt :budget_type) budget-type-spec
   (ds/opt :pacing_delivery_type) pacing-delivery-type-spec
   })

(def ad-group-create-request-all-of1-spec
  (ds/spec
    {:name ::ad-group-create-request-all-of1
     :spec ad-group-create-request-all-of1-data}))
