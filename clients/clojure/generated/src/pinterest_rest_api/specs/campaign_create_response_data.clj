(ns pinterest-rest-api.specs.campaign-create-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.campaign-bid-options :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.campaign-summary-status :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-response-data-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :daily_spend_cap) int?
   (ds/opt :end_time) int?
   (ds/opt :is_automated_campaign) boolean?
   (ds/opt :is_flexible_daily_budgets) boolean?
   (ds/opt :lifetime_spend_cap) int?
   (ds/opt :name) string?
   (ds/opt :order_line_id) string?
   (ds/opt :start_time) int?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :default_ad_group_budget_in_micro_currency) int?
   (ds/opt :is_campaign_budget_optimization) boolean?
   (ds/opt :id) string?
   (ds/opt :bid_options) campaign-bid-options-spec
   (ds/opt :created_time) int?
   (ds/opt :is_performance_plus) boolean?
   (ds/opt :objective_type) objective-type-spec
   (ds/opt :summary_status) campaign-summary-status-spec
   (ds/opt :type) string?
   (ds/opt :updated_time) int?
   })

(def campaign-create-response-data-spec
  (ds/spec
    {:name ::campaign-create-response-data
     :spec campaign-create-response-data-data}))
