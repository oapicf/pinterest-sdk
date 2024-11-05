(ns pinterest-rest-api.specs.ad-group-update-request
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
            )
  (:import (java.io File)))


(def ad-group-update-request-data
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
   (ds/req :id) string?
   })

(def ad-group-update-request-spec
  (ds/spec
    {:name ::ad-group-update-request
     :spec ad-group-update-request-data}))
