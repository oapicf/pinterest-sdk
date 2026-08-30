(ns pinterest-rest-api.specs.ad-group-update-batch-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bid-strategy-type :refer :all]
            [pinterest-rest-api.specs.action-type :refer :all]
            [pinterest-rest-api.specs.budget-type :refer :all]
            [pinterest-rest-api.specs.adgroup-tracking-features :refer :all]
            [pinterest-rest-api.specs.nullable-optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.pacing-delivery-type :refer :all]
            [pinterest-rest-api.specs.performance-plus-campaign-settings :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.placement-traffic-type :refer :all]
            [pinterest-rest-api.specs.promotion-application-level :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            [pinterest-rest-api.specs.targeting-spec-operations :refer :all]
            [pinterest-rest-api.specs.ad-group-tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def ad-group-update-batch-update-data
  {
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :bid_multiplier) float?
   (ds/opt :bid_strategy_type) bid-strategy-type-spec
   (ds/opt :billable_event) action-type-spec
   (ds/opt :budget_in_micro_currency) int?
   (ds/opt :budget_type) budget-type-spec
   (ds/opt :campaign_id) string?
   (ds/opt :customer_segment_id) string?
   (ds/opt :end_time) int?
   (ds/opt :ext_features) adgroup-tracking-features-spec
   (ds/opt :feed_profile_id) string?
   (ds/req :id) string?
   (ds/opt :is_creative_optimization) boolean?
   (ds/opt :is_local_inventory) boolean?
   (ds/opt :lifetime_frequency_cap) int?
   (ds/opt :local_inventory_radius_in_miles) float?
   (ds/opt :name) string?
   (ds/opt :optimization_goal_metadata) nullable-optimization-goal-metadata-spec
   (ds/opt :pacing_delivery_type) pacing-delivery-type-spec
   (ds/opt :performance_plus_campaign_settings) performance-plus-campaign-settings-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :placement_traffic_type) placement-traffic-type-spec
   (ds/opt :promotion_application_level) promotion-application-level-spec
   (ds/opt :promotion_id) string?
   (ds/opt :promotion_ids) (s/coll-of string?)
   (ds/opt :start_time) int?
   (ds/opt :status) entity-status-spec
   (ds/opt :targeting_spec) targeting-spec-optimal-spec
   (ds/opt :targeting_spec_operations) (s/coll-of targeting-spec-operations-spec)
   (ds/opt :targeting_template_ids) (s/coll-of string?)
   (ds/opt :tracking_urls) ad-group-tracking-urls-spec
   })

(def ad-group-update-batch-update-spec
  (ds/spec
    {:name ::ad-group-update-batch-update
     :spec ad-group-update-batch-update-data}))
