(ns pinterest-rest-api.specs.campaign-create-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.campaign-summary-status :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-response-data-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :name) string?
   (ds/opt :status) entity-status-spec
   (ds/opt :lifetime_spend_cap) int?
   (ds/opt :daily_spend_cap) int?
   (ds/opt :order_line_id) string?
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :start_time) int?
   (ds/opt :end_time) int?
   (ds/opt :is_flexible_daily_budgets) boolean?
   (ds/opt :default_ad_group_budget_in_micro_currency) int?
   (ds/opt :is_automated_campaign) boolean?
   (ds/opt :id) string?
   (ds/opt :objective_type) objective-type-spec
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   (ds/opt :type) string?
   (ds/opt :is_campaign_budget_optimization) boolean?
   (ds/opt :summary_status) campaign-summary-status-spec
   })

(def campaign-create-response-data-spec
  (ds/spec
    {:name ::campaign-create-response-data
     :spec campaign-create-response-data-data}))
