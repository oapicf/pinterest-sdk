(ns pinterest-rest-api.specs.optimization-goal-metadata-scrollup-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def optimization-goal-metadata-scrollup-goal-metadata-data
  {
   (ds/opt :scrollup_goal_value_in_micro_currency) string?
   })

(def optimization-goal-metadata-scrollup-goal-metadata-spec
  (ds/spec
    {:name ::optimization-goal-metadata-scrollup-goal-metadata
     :spec optimization-goal-metadata-scrollup-goal-metadata-data}))
