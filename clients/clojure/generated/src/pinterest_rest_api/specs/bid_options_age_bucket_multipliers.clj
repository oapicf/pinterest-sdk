(ns pinterest-rest-api.specs.bid-options-age-bucket-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-options-age-bucket-multipliers-data
  {
   (ds/opt :18-24) float?
   (ds/opt :25-34) float?
   (ds/opt :35-44) float?
   (ds/opt :45-49) float?
   (ds/opt :50-54) float?
   (ds/opt :55-64) float?
   (ds/opt :65) float?
   })

(def bid-options-age-bucket-multipliers-spec
  (ds/spec
    {:name ::bid-options-age-bucket-multipliers
     :spec bid-options-age-bucket-multipliers-data}))
