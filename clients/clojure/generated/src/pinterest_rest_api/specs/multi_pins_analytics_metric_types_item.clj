(ns pinterest-rest-api.specs.multi-pins-analytics-metric-types-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def multi-pins-analytics-metric-types-item-data
  {
   })

(def multi-pins-analytics-metric-types-item-spec
  (ds/spec
    {:name ::multi-pins-analytics-metric-types-item
     :spec multi-pins-analytics-metric-types-item-data}))
