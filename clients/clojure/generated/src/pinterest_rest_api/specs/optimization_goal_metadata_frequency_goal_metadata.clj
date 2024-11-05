(ns pinterest-rest-api.specs.optimization-goal-metadata-frequency-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def optimization-goal-metadata-frequency-goal-metadata-data
  {
   (ds/opt :frequency) int?
   (ds/opt :timerange) string?
   })

(def optimization-goal-metadata-frequency-goal-metadata-spec
  (ds/spec
    {:name ::optimization-goal-metadata-frequency-goal-metadata
     :spec optimization-goal-metadata-frequency-goal-metadata-data}))
