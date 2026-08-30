(ns pinterest-rest-api.specs.campaign-delivery-estimates-campaign
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-delivery-estimates :refer :all]
            [pinterest-rest-api.specs.budget-duration-type :refer :all]
            [pinterest-rest-api.specs.delivery-estimate-objective-type :refer :all]
            )
  (:import (java.io File)))


(def campaign-delivery-estimates-campaign-data
  {
   (ds/req :ad_groups) (s/coll-of ad-group-delivery-estimates-spec)
   (ds/req :budget_duration_type) budget-duration-type-spec
   (ds/opt :daily_spend_cap) int?
   (ds/opt :end_date) string?
   (ds/opt :lifetime_spend_cap) int?
   (ds/req :objective_type) delivery-estimate-objective-type-spec
   (ds/req :start_date) string?
   })

(def campaign-delivery-estimates-campaign-spec
  (ds/spec
    {:name ::campaign-delivery-estimates-campaign
     :spec campaign-delivery-estimates-campaign-data}))
