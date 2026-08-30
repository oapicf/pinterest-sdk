(ns pinterest-rest-api.specs.top-video-pins-analytics-response-date-availability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def top-video-pins-analytics-response-date-availability-data
  {
   (ds/opt :is_realtime) boolean?
   (ds/opt :latest_available_timestamp) float?
   })

(def top-video-pins-analytics-response-date-availability-spec
  (ds/spec
    {:name ::top-video-pins-analytics-response-date-availability
     :spec top-video-pins-analytics-response-date-availability-data}))
