(ns pinterest-rest-api.specs.bid-floor-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            [pinterest-rest-api.specs.action-type :refer :all]
            [pinterest-rest-api.specs.optimization-goal-metadata :refer :all]
            [pinterest-rest-api.specs.creative-type :refer :all]
            )
  (:import (java.io File)))


(def bid-floor-spec-data
  {
   (ds/opt :countries) (s/coll-of country-spec)
   (ds/req :currency) currency-spec
   (ds/opt :objective_type) objective-type-spec
   (ds/req :billable_event) action-type-spec
   (ds/opt :optimization_goal_metadata) optimization-goal-metadata-spec
   (ds/opt :creative_type) creative-type-spec
   })

(def bid-floor-spec-spec
  (ds/spec
    {:name ::bid-floor-spec
     :spec bid-floor-spec-data}))
