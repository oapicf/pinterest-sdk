(ns pinterest-rest-api.specs.pin-analytics-metrics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-analytics-metrics-response-daily-metrics-inner :refer :all]
            )
  (:import (java.io File)))


(def pin-analytics-metrics-response-data
  {
   (ds/opt :lifetime_metrics) (s/map-of string? int?)
   (ds/opt :daily_metrics) (s/coll-of pin-analytics-metrics-response-daily-metrics-inner-spec)
   (ds/opt :summary_metrics) (s/map-of string? float?)
   })

(def pin-analytics-metrics-response-spec
  (ds/spec
    {:name ::pin-analytics-metrics-response
     :spec pin-analytics-metrics-response-data}))
