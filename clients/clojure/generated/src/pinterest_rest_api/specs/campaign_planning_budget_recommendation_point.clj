(ns pinterest-rest-api.specs.campaign-planning-budget-recommendation-point
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-estimation-type :refer :all]
            [pinterest-rest-api.specs.campaign-planning-point-estimate :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-budget-recommendation-point-data
  {
   (ds/opt :estimation_type) campaign-planning-estimation-type-spec
   (ds/opt :point_estimate) campaign-planning-point-estimate-spec
   })

(def campaign-planning-budget-recommendation-point-spec
  (ds/spec
    {:name ::campaign-planning-budget-recommendation-point
     :spec campaign-planning-budget-recommendation-point-data}))
