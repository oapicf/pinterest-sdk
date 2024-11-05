(ns pinterest-rest-api.specs.top-video-pins-analytics-response-pins-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.data-status :refer :all]
            )
  (:import (java.io File)))


(def top-video-pins-analytics-response-pins-inner-data
  {
   (ds/opt :metrics) (s/map-of string? float?)
   (ds/opt :data_status) (s/map-of string? data-status-spec)
   (ds/opt :pin_id) string?
   })

(def top-video-pins-analytics-response-pins-inner-spec
  (ds/spec
    {:name ::top-video-pins-analytics-response-pins-inner
     :spec top-video-pins-analytics-response-pins-inner-data}))
