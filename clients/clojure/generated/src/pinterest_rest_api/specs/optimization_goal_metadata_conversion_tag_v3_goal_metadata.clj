(ns pinterest-rest-api.specs.optimization-goal-metadata-conversion-tag-v3-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows :refer :all]
            )
  (:import (java.io File)))


(def optimization-goal-metadata-conversion-tag-v3-goal-metadata-data
  {
   (ds/opt :attribution_windows) optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows-spec
   (ds/opt :conversion_event) string?
   (ds/opt :conversion_tag_id) string?
   (ds/opt :cpa_goal_value_in_micro_currency) string?
   (ds/opt :is_roas_optimized) boolean?
   (ds/opt :learning_mode_type) string?
   })

(def optimization-goal-metadata-conversion-tag-v3-goal-metadata-spec
  (ds/spec
    {:name ::optimization-goal-metadata-conversion-tag-v3-goal-metadata
     :spec optimization-goal-metadata-conversion-tag-v3-goal-metadata-data}))
