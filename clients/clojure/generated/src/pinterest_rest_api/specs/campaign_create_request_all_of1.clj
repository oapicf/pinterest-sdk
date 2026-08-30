(ns pinterest-rest-api.specs.campaign-create-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-bid-options-create :refer :all]
            [pinterest-rest-api.specs.intended-promotion-type :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-request-all-of1-data
  {
   (ds/opt :bid_options) campaign-bid-options-create-spec
   (ds/opt :intended_promotion_type) intended-promotion-type-spec
   (ds/opt :is_automated_campaign) boolean?
   (ds/opt :is_campaign_budget_optimization) boolean?
   (ds/opt :is_flexible_daily_budgets) boolean?
   (ds/opt :is_ltv_optimized) boolean?
   (ds/opt :is_performance_plus) boolean?
   (ds/opt :is_top_of_search) boolean?
   (ds/req :objective_type) objective-type-spec
   (ds/opt :status) entity-status-spec
   })

(def campaign-create-request-all-of1-spec
  (ds/spec
    {:name ::campaign-create-request-all-of1
     :spec campaign-create-request-all-of1-data}))
