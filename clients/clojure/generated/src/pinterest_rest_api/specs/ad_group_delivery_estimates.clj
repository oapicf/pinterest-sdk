(ns pinterest-rest-api.specs.ad-group-delivery-estimates
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-audience-sizing-creative-types :refer :all]
            [pinterest-rest-api.specs.ad-group-delivery-estimates-keywords-items :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.optimization-type :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            )
  (:import (java.io File)))


(def ad-group-delivery-estimates-data
  {
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :creative_types) (s/coll-of ad-group-audience-sizing-creative-types-spec)
   (ds/opt :keywords) (s/coll-of ad-group-delivery-estimates-keywords-items-spec)
   (ds/opt :monthly_frequency_cap) int?
   (ds/opt :optimization_goal_metadata) optimization-goal-metadata-spec
   (ds/opt :optimization_type) optimization-type-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :product_group_ids) (s/coll-of string?)
   (ds/opt :targeting_spec) targeting-spec-optimal-spec
   })

(def ad-group-delivery-estimates-spec
  (ds/spec
    {:name ::ad-group-delivery-estimates
     :spec ad-group-delivery-estimates-data}))
