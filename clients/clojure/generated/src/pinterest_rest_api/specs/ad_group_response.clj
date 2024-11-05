(ns pinterest-rest-api.specs.ad-group-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.budget-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.pacing-delivery-type :refer :all]
            [pinterest-rest-api.specs.action-type :refer :all]
            [pinterest-rest-api.specs.ad-group-summary-status :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def ad-group-response-data
  {
   (ds/opt :name) string?
   (ds/opt :status) entity-status-spec
   (ds/opt :budget_in_micro_currency) int?
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :optimization_goal_metadata) optimization-goal-metadata-spec
   (ds/opt :budget_type) budget-type-spec
   (ds/opt :start_time) int?
   (ds/opt :end_time) int?
   (ds/opt :targeting_spec) targeting-spec-spec
   (ds/opt :lifetime_frequency_cap) int?
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :pacing_delivery_type) pacing-delivery-type-spec
   (ds/opt :campaign_id) string?
   (ds/opt :billable_event) action-type-spec
   (ds/opt :bid_strategy_type) string?
   (ds/opt :targeting_template_ids) (s/coll-of string?)
   (ds/opt :id) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   (ds/opt :type) string?
   (ds/opt :conversion_learning_mode_type) string?
   (ds/opt :summary_status) ad-group-summary-status-spec
   (ds/opt :feed_profile_id) string?
   (ds/opt :dca_assets) any-type-spec
   })

(def ad-group-response-spec
  (ds/spec
    {:name ::ad-group-response
     :spec ad-group-response-data}))
