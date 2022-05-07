(ns pinterest-rest-api.specs.analytics-metrics-response-daily-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def analytics-metrics-response-daily-metrics-data
  {
   (ds/opt :data_status) string?
   (ds/opt :date) string?
   (ds/opt :metrics) (s/map-of string? float?)
   })

(def analytics-metrics-response-daily-metrics-spec
  (ds/spec
    {:name ::analytics-metrics-response-daily-metrics
     :spec analytics-metrics-response-daily-metrics-data}))
