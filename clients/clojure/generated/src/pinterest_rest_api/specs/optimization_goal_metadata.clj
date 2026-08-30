(ns pinterest-rest-api.specs.optimization-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-v3-goal-metadata :refer :all]
            [pinterest-rest-api.specs.frequency-goal-metadata :refer :all]
            [pinterest-rest-api.specs.scrollup-goal-metadata :refer :all]
            )
  (:import (java.io File)))


(def optimization-goal-metadata-data
  {
   (ds/opt :conversion_tag_v3_goal_metadata) conversion-tag-v3-goal-metadata-spec
   (ds/opt :frequency_goal_metadata) frequency-goal-metadata-spec
   (ds/opt :scrollup_goal_metadata) scrollup-goal-metadata-spec
   })

(def optimization-goal-metadata-spec
  (ds/spec
    {:name ::optimization-goal-metadata
     :spec optimization-goal-metadata-data}))
