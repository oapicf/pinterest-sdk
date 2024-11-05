(ns pinterest-rest-api.specs.pin-analytics-metrics-response-daily-metrics-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.data-status :refer :all]
            )
  (:import (java.io File)))


(def pin-analytics-metrics-response-daily-metrics-inner-data
  {
   (ds/opt :data_status) data-status-spec
   (ds/opt :date) string?
   (ds/opt :metrics) (s/map-of string? float?)
   })

(def pin-analytics-metrics-response-daily-metrics-inner-spec
  (ds/spec
    {:name ::pin-analytics-metrics-response-daily-metrics-inner
     :spec pin-analytics-metrics-response-daily-metrics-inner-data}))
