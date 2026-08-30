(ns pinterest-rest-api.specs.pin-analytics-daily-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.data-status :refer :all]
            )
  (:import (java.io File)))


(def pin-analytics-daily-metrics-data
  {
   (ds/opt :data_status) data-status-spec
   (ds/opt :date) string?
   (ds/opt :metrics) (s/map-of string? float?)
   })

(def pin-analytics-daily-metrics-spec
  (ds/spec
    {:name ::pin-analytics-daily-metrics
     :spec pin-analytics-daily-metrics-data}))
