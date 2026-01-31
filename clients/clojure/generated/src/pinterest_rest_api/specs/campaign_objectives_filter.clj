(ns pinterest-rest-api.specs.campaign-objectives-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.objective-type :refer :all]
            )
  (:import (java.io File)))


(def campaign-objectives-filter-data
  {
   (ds/opt :campaign_objective_types) (s/coll-of objective-type-spec)
   })

(def campaign-objectives-filter-spec
  (ds/spec
    {:name ::campaign-objectives-filter
     :spec campaign-objectives-filter-data}))
