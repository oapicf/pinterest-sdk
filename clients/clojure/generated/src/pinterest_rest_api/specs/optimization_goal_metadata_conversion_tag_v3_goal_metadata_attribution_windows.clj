(ns pinterest-rest-api.specs.optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows-data
  {
   (ds/opt :click_window_days) int?
   (ds/opt :engagement_window_days) int?
   (ds/opt :view_window_days) int?
   })

(def optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows-spec
  (ds/spec
    {:name ::optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows
     :spec optimization-goal-metadata-conversion-tag-v3-goal-metadata-attribution-windows-data}))
