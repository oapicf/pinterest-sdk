(ns pinterest-rest-api.specs.frequency-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def frequency-multipliers-data
  {
   (ds/opt :IMPRESSION_COUNT) string?
   })

(def frequency-multipliers-spec
  (ds/spec
    {:name ::frequency-multipliers
     :spec frequency-multipliers-data}))
