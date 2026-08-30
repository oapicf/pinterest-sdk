(ns pinterest-rest-api.specs.ad-group-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bid-strategy-type :refer :all]
            [pinterest-rest-api.specs.action-type :refer :all]
            [pinterest-rest-api.specs.conversion-learning-mode-type :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.adgroup-tracking-features :refer :all]
            [pinterest-rest-api.specs.nullable-optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.performance-plus-campaign-settings :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.placement-traffic-type :refer :all]
            [pinterest-rest-api.specs.promotion-application-level :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.summary-status :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            [pinterest-rest-api.specs.ad-group-tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def ad-group-base-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :bid_strategy_type) bid-strategy-type-spec
   (ds/req :billable_event) action-type-spec
   (ds/opt :budget_in_micro_currency) int?
   (ds/req :campaign_id) string?
   (ds/req :conversion_learning_mode_type) conversion-learning-mode-type-spec
   (ds/req :created_time) int?
   (ds/opt :customer_segment_id) string?
   (ds/opt :dca_assets) any-type-spec
   (ds/opt :end_time) int?
   (ds/opt :ext_features) adgroup-tracking-features-spec
   (ds/opt :feed_profile_id) string?
   (ds/req :id) string?
   (ds/opt :is_creative_optimization) boolean?
   (ds/opt :is_local_inventory) boolean?
   (ds/opt :lifetime_frequency_cap) int?
   (ds/opt :local_inventory_radius_in_miles) float?
   (ds/req :name) string?
   (ds/opt :optimization_goal_metadata) nullable-optimization-goal-metadata-spec
   (ds/opt :performance_plus_campaign_settings) performance-plus-campaign-settings-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :placement_traffic_type) placement-traffic-type-spec
   (ds/opt :promotion_application_level) promotion-application-level-spec
   (ds/opt :promotion_id) string?
   (ds/opt :promotion_ids) (s/coll-of string?)
   (ds/opt :start_time) int?
   (ds/opt :status) entity-status-spec
   (ds/req :summary_status) summary-status-spec
   (ds/opt :targeting_spec) targeting-spec-optimal-spec
   (ds/opt :targeting_template_ids) (s/coll-of string?)
   (ds/opt :tracking_urls) ad-group-tracking-urls-spec
   (ds/req :type) string?
   (ds/req :updated_time) int?
   })

(def ad-group-base-spec
  (ds/spec
    {:name ::ad-group-base
     :spec ad-group-base-data}))
