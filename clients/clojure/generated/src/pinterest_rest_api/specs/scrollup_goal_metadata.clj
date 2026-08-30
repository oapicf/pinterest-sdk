(ns pinterest-rest-api.specs.scrollup-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def scrollup-goal-metadata-data
  {
   (ds/opt :scrollup_goal_value_in_micro_currency) string?
   })

(def scrollup-goal-metadata-spec
  (ds/spec
    {:name ::scrollup-goal-metadata
     :spec scrollup-goal-metadata-data}))
