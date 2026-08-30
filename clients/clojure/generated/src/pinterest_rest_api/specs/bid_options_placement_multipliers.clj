(ns pinterest-rest-api.specs.bid-options-placement-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-options-placement-multipliers-data
  {
   (ds/opt :browse) float?
   (ds/opt :related_pins) float?
   (ds/opt :search) float?
   })

(def bid-options-placement-multipliers-spec
  (ds/spec
    {:name ::bid-options-placement-multipliers
     :spec bid-options-placement-multipliers-data}))
