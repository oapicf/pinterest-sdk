(ns pinterest-rest-api.specs.schedule-bid-options-placement-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-bid-options-placement-multipliers-data
  {
   (ds/opt :browse) float?
   (ds/opt :related_pins) float?
   (ds/opt :search) float?
   })

(def schedule-bid-options-placement-multipliers-spec
  (ds/spec
    {:name ::schedule-bid-options-placement-multipliers
     :spec schedule-bid-options-placement-multipliers-data}))
