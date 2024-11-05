(ns pinterest-rest-api.specs.analytics-metrics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.analytics-daily-metrics :refer :all]
            )
  (:import (java.io File)))


(def analytics-metrics-response-data
  {
   (ds/opt :summary_metrics) (s/map-of string? float?)
   (ds/opt :daily_metrics) (s/coll-of analytics-daily-metrics-spec)
   })

(def analytics-metrics-response-spec
  (ds/spec
    {:name ::analytics-metrics-response
     :spec analytics-metrics-response-data}))
