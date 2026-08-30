(ns pinterest-rest-api.specs.campaign-planning-curve-estimate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-estimation-type :refer :all]
            [pinterest-rest-api.specs.campaign-planning-point-estimate :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-curve-estimate-data
  {
   (ds/opt :estimation_type) campaign-planning-estimation-type-spec
   (ds/opt :points) (s/coll-of campaign-planning-point-estimate-spec)
   })

(def campaign-planning-curve-estimate-spec
  (ds/spec
    {:name ::campaign-planning-curve-estimate
     :spec campaign-planning-curve-estimate-data}))
