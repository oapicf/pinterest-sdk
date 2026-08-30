(ns pinterest-rest-api.specs.bid-options-gender-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bid-options-gender-multipliers-data
  {
   (ds/opt :female) float?
   (ds/opt :male) float?
   })

(def bid-options-gender-multipliers-spec
  (ds/spec
    {:name ::bid-options-gender-multipliers
     :spec bid-options-gender-multipliers-data}))
