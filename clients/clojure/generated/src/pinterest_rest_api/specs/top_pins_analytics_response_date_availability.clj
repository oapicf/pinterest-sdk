(ns pinterest-rest-api.specs.top-pins-analytics-response-date-availability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def top-pins-analytics-response-date-availability-data
  {
   (ds/opt :latest_available_timestamp) float?
   (ds/opt :is_realtime) boolean?
   })

(def top-pins-analytics-response-date-availability-spec
  (ds/spec
    {:name ::top-pins-analytics-response-date-availability
     :spec top-pins-analytics-response-date-availability-data}))
