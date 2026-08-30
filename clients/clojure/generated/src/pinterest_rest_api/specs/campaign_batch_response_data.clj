(ns pinterest-rest-api.specs.campaign-batch-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-bid-options :refer :all]
            [pinterest-rest-api.specs.intended-promotion-type :refer :all]
            [pinterest-rest-api.specs.campaign-objective-type :refer :all]
            [pinterest-rest-api.specs.performance-plus-campaign-settings :refer :all]
            [pinterest-rest-api.specs.nullable-entity-status :refer :all]
            [pinterest-rest-api.specs.summary-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def campaign-batch-response-data-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :bid_options) campaign-bid-options-spec
   (ds/opt :created_time) int?
   (ds/opt :daily_spend_cap) int?
   (ds/opt :default_ad_group_budget_in_micro_currency) int?
   (ds/opt :end_time) int?
   (ds/opt :id) string?
   (ds/opt :intended_promotion_type) intended-promotion-type-spec
   (ds/opt :is_automated_campaign) boolean?
   (ds/opt :is_campaign_budget_optimization) boolean?
   (ds/opt :is_carting) boolean?
   (ds/opt :is_flexible_daily_budgets) boolean?
   (ds/opt :is_ltv_optimized) boolean?
   (ds/opt :is_performance_plus) boolean?
   (ds/opt :is_top_of_search) boolean?
   (ds/opt :lifetime_spend_cap) int?
   (ds/opt :name) string?
   (ds/opt :objective_type) campaign-objective-type-spec
   (ds/opt :order_line_id) string?
   (ds/opt :performance_plus_campaign_settings) performance-plus-campaign-settings-spec
   (ds/opt :start_time) int?
   (ds/opt :status) nullable-entity-status-spec
   (ds/opt :summary_status) summary-status-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :type) string?
   (ds/opt :updated_time) int?
   })

(def campaign-batch-response-data-spec
  (ds/spec
    {:name ::campaign-batch-response-data
     :spec campaign-batch-response-data-data}))
