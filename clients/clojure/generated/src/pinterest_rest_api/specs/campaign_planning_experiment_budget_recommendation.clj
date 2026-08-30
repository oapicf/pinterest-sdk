(ns pinterest-rest-api.specs.campaign-planning-experiment-budget-recommendation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-budget-recommendation-point :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-experiment-budget-recommendation-data
  {
   (ds/opt :budget_recommendation) int?
   (ds/opt :lifetime_days_recommendation) int?
   (ds/opt :point_estimations) (s/coll-of campaign-planning-budget-recommendation-point-spec)
   (ds/opt :version_id) string?
   })

(def campaign-planning-experiment-budget-recommendation-spec
  (ds/spec
    {:name ::campaign-planning-experiment-budget-recommendation
     :spec campaign-planning-experiment-budget-recommendation-data}))
