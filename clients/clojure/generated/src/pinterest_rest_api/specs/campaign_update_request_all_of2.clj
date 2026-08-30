(ns pinterest-rest-api.specs.campaign-update-request-all-of2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-bid-options-update :refer :all]
            [pinterest-rest-api.specs.intended-promotion-type :refer :all]
            [pinterest-rest-api.specs.objective-type :refer :all]
            )
  (:import (java.io File)))


(def campaign-update-request-all-of2-data
  {
   (ds/opt :bid_options) campaign-bid-options-update-spec
   (ds/opt :intended_promotion_type) intended-promotion-type-spec
   (ds/opt :is_ltv_optimized) boolean?
   (ds/opt :is_performance_plus) boolean?
   (ds/opt :is_top_of_search) boolean?
   (ds/opt :objective_type) objective-type-spec
   })

(def campaign-update-request-all-of2-spec
  (ds/spec
    {:name ::campaign-update-request-all-of2
     :spec campaign-update-request-all-of2-data}))
