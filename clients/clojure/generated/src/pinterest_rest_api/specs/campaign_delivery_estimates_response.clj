(ns pinterest-rest-api.specs.campaign-delivery-estimates-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-curve-estimate :refer :all]
            [pinterest-rest-api.specs.campaign-delivery-estimates-derived-metrics :refer :all]
            )
  (:import (java.io File)))


(def campaign-delivery-estimates-response-data
  {
   (ds/opt :curves) (s/coll-of campaign-planning-curve-estimate-spec)
   (ds/opt :derived_metrics) campaign-delivery-estimates-derived-metrics-spec
   (ds/opt :max_potential_spend) int?
   })

(def campaign-delivery-estimates-response-spec
  (ds/spec
    {:name ::campaign-delivery-estimates-response
     :spec campaign-delivery-estimates-response-data}))
