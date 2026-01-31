(ns pinterest-rest-api.specs.quality-component-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.quality-component-issue :refer :all]
            )
  (:import (java.io File)))


(def quality-component-details-data
  {
   (ds/req :coverage) float?
   (ds/opt :issues) (s/coll-of quality-component-issue-spec)
   (ds/opt :overlap) float?
   })

(def quality-component-details-spec
  (ds/spec
    {:name ::quality-component-details
     :spec quality-component-details-data}))
