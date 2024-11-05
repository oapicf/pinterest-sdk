(ns pinterest-rest-api.specs.pins-analytics-metric-types-parameter-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pins-analytics-metric-types-parameter-inner-data
  {
   })

(def pins-analytics-metric-types-parameter-inner-spec
  (ds/spec
    {:name ::pins-analytics-metric-types-parameter-inner
     :spec pins-analytics-metric-types-parameter-inner-data}))
