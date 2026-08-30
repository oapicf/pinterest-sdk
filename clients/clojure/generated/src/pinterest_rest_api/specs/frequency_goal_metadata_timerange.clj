(ns pinterest-rest-api.specs.frequency-goal-metadata-timerange
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def frequency-goal-metadata-timerange-data
  {
   })

(def frequency-goal-metadata-timerange-spec
  (ds/spec
    {:name ::frequency-goal-metadata-timerange
     :spec frequency-goal-metadata-timerange-data}))
