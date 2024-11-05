(ns pinterest-rest-api.specs.analytics-daily-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.data-status :refer :all]
            )
  (:import (java.io File)))


(def analytics-daily-metrics-data
  {
   (ds/opt :data_status) data-status-spec
   (ds/opt :date) string?
   (ds/opt :metrics) (s/map-of string? float?)
   })

(def analytics-daily-metrics-spec
  (ds/spec
    {:name ::analytics-daily-metrics
     :spec analytics-daily-metrics-data}))
