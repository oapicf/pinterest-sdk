(ns pinterest-rest-api.specs.conversion-tag-v3-goal-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.attribution-windows :refer :all]
            [pinterest-rest-api.specs.conversion-event :refer :all]
            )
  (:import (java.io File)))


(def conversion-tag-v3-goal-metadata-data
  {
   (ds/opt :attribution_windows) attribution-windows-spec
   (ds/opt :conversion_event) conversion-event-spec
   (ds/opt :conversion_tag_id) string?
   (ds/opt :cpa_goal_value_in_micro_currency) string?
   (ds/opt :is_roas_optimized) boolean?
   (ds/opt :reporting_event) string?
   })

(def conversion-tag-v3-goal-metadata-spec
  (ds/spec
    {:name ::conversion-tag-v3-goal-metadata
     :spec conversion-tag-v3-goal-metadata-data}))
