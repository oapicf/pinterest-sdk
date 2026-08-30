(ns pinterest-rest-api.specs.campaign-create-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.mobile-app-platform :refer :all]
            [pinterest-rest-api.specs.campaign-bid-options :refer :all]
            [pinterest-rest-api.specs.intended-promotion-type :refer :all]
            [pinterest-rest-api.specs.conversion-objective-type :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-item-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :app_id) string?
   (ds/opt :app_platform) mobile-app-platform-spec
   (ds/opt :bid_options) campaign-bid-options-spec
   (ds/opt :daily_spend_cap) int?
   (ds/opt :default_ad_group_budget_in_micro_currency) int?
   (ds/opt :end_time) int?
   (ds/opt :intended_promotion_type) intended-promotion-type-spec
   (ds/opt :is_automated_campaign) boolean?
   (ds/opt :is_campaign_budget_optimization) boolean?
   (ds/opt :is_flexible_daily_budgets) boolean?
   (ds/opt :is_ltv_optimized) boolean?
   (ds/opt :is_performance_plus) boolean?
   (ds/opt :is_top_of_search) boolean?
   (ds/opt :lifetime_spend_cap) int?
   (ds/req :name) string?
   (ds/req :objective_type) conversion-objective-type-spec
   (ds/opt :order_line_id) string?
   (ds/opt :start_time) int?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   })

(def campaign-create-item-spec
  (ds/spec
    {:name ::campaign-create-item
     :spec campaign-create-item-data}))
