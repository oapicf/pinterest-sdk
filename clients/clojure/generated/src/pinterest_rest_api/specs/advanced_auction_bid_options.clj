(ns pinterest-rest-api.specs.advanced-auction-bid-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.placement-multipliers :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-bid-options-data
  {
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :app_type_multipliers) app-type-multipliers-spec
   (ds/opt :placement_multipliers) placement-multipliers-spec
   })

(def advanced-auction-bid-options-spec
  (ds/spec
    {:name ::advanced-auction-bid-options
     :spec advanced-auction-bid-options-data}))
