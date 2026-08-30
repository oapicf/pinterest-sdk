(ns pinterest-rest-api.specs.schedule-placement-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-placement-multipliers-data
  {
   (ds/opt :browse) float?
   (ds/opt :related_pins) float?
   (ds/opt :search) float?
   })

(def schedule-placement-multipliers-spec
  (ds/spec
    {:name ::schedule-placement-multipliers
     :spec schedule-placement-multipliers-data}))
