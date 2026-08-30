(ns pinterest-rest-api.specs.campaign-delivery-estimates-derived-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-delivery-estimates-derived-metrics-data
  {
   (ds/opt :cpc) float?
   (ds/opt :cpc_lower) float?
   (ds/opt :cpc_upper) float?
   (ds/opt :cpm) float?
   (ds/opt :cpm_lower) float?
   (ds/opt :cpm_upper) float?
   (ds/opt :lifetime_frequency) float?
   (ds/opt :lifetime_frequency_lower) float?
   (ds/opt :lifetime_frequency_upper) float?
   (ds/opt :lifetime_impression) float?
   (ds/opt :lifetime_impression_lower) float?
   (ds/opt :lifetime_impression_upper) float?
   (ds/opt :lifetime_reach) float?
   (ds/opt :lifetime_reach_lower) float?
   (ds/opt :lifetime_reach_upper) float?
   (ds/opt :weekly_click) float?
   (ds/opt :weekly_click_lower) float?
   (ds/opt :weekly_click_upper) float?
   (ds/opt :weekly_frequency) float?
   (ds/opt :weekly_frequency_lower) float?
   (ds/opt :weekly_frequency_upper) float?
   (ds/opt :weekly_impression) float?
   (ds/opt :weekly_impression_lower) float?
   (ds/opt :weekly_impression_upper) float?
   (ds/opt :weekly_reach) float?
   (ds/opt :weekly_reach_lower) float?
   (ds/opt :weekly_reach_upper) float?
   })

(def campaign-delivery-estimates-derived-metrics-spec
  (ds/spec
    {:name ::campaign-delivery-estimates-derived-metrics
     :spec campaign-delivery-estimates-derived-metrics-data}))
