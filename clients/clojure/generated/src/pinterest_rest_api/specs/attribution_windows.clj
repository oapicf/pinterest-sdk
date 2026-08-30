(ns pinterest-rest-api.specs.attribution-windows
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def attribution-windows-data
  {
   (ds/opt :click_window_days) int?
   (ds/opt :engagement_window_days) int?
   (ds/opt :view_window_days) int?
   })

(def attribution-windows-spec
  (ds/spec
    {:name ::attribution-windows
     :spec attribution-windows-data}))
