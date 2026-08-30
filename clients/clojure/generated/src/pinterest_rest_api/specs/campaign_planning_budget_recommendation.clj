(ns pinterest-rest-api.specs.campaign-planning-budget-recommendation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-experiment-budget-recommendation :refer :all]
            [pinterest-rest-api.specs.campaign-planning-budget-recommendation-point :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-budget-recommendation-data
  {
   (ds/opt :budget_recommendation) int?
   (ds/opt :experiment_campaign_budget_recommendation) (s/coll-of campaign-planning-experiment-budget-recommendation-spec)
   (ds/opt :lifetime_days_recommendation) int?
   (ds/opt :point_estimations) (s/coll-of campaign-planning-budget-recommendation-point-spec)
   })

(def campaign-planning-budget-recommendation-spec
  (ds/spec
    {:name ::campaign-planning-budget-recommendation
     :spec campaign-planning-budget-recommendation-data}))
