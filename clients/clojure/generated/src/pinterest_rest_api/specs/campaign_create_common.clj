(ns pinterest-rest-api.specs.campaign-create-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-common-data
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
   })

(def campaign-create-common-spec
  (ds/spec
    {:name ::campaign-create-common
     :spec campaign-create-common-data}))
