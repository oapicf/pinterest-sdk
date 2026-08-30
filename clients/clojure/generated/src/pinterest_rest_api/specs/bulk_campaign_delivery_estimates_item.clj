(ns pinterest-rest-api.specs.bulk-campaign-delivery-estimates-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-ad-group-audience-size :refer :all]
            [pinterest-rest-api.specs.campaign-planning-conversion-rate :refer :all]
            [pinterest-rest-api.specs.campaign-planning-curve-estimate :refer :all]
            [pinterest-rest-api.specs.campaign-delivery-estimates-derived-metrics :refer :all]
            [pinterest-rest-api.specs.campaign-planning-response-error :refer :all]
            )
  (:import (java.io File)))


(def bulk-campaign-delivery-estimates-item-data
  {
   (ds/opt :adgroup_audience_sizes) (s/coll-of campaign-planning-ad-group-audience-size-spec)
   (ds/opt :conversion_rate) float?
   (ds/opt :conversion_rates) (s/coll-of campaign-planning-conversion-rate-spec)
   (ds/opt :curves) (s/coll-of campaign-planning-curve-estimate-spec)
   (ds/opt :derived_metrics) campaign-delivery-estimates-derived-metrics-spec
   (ds/opt :errors) (s/coll-of campaign-planning-response-error-spec)
   (ds/opt :estimate_id) string?
   (ds/opt :max_potential_spend) int?
   })

(def bulk-campaign-delivery-estimates-item-spec
  (ds/spec
    {:name ::bulk-campaign-delivery-estimates-item
     :spec bulk-campaign-delivery-estimates-item-data}))
