(ns pinterest-rest-api.specs.ad-groups-analytics-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-groups-analytics-metrics-data
  {
   (ds/opt :AD_GROUP_ID) string?
   (ds/opt :DATE) inst?
   })

(def ad-groups-analytics-metrics-spec
  (ds/spec
    {:name ::ad-groups-analytics-metrics
     :spec ad-groups-analytics-metrics-data}))
