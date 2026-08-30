(ns pinterest-rest-api.specs.frequency-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.frequency-goal-metadata-timerange :refer :all]
            )
  (:import (java.io File)))


(def frequency-goal-metadata-data
  {
   (ds/opt :frequency) int?
   (ds/opt :timerange) frequency-goal-metadata-timerange-spec
   })

(def frequency-goal-metadata-spec
  (ds/spec
    {:name ::frequency-goal-metadata
     :spec frequency-goal-metadata-data}))
