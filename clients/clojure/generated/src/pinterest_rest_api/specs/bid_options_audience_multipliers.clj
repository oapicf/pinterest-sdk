(ns pinterest-rest-api.specs.bid-options-audience-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-options-audience-multipliers-data
  {
   (ds/req :audience_id) string?
   (ds/req :multiplier) float?
   })

(def bid-options-audience-multipliers-spec
  (ds/spec
    {:name ::bid-options-audience-multipliers
     :spec bid-options-audience-multipliers-data}))
