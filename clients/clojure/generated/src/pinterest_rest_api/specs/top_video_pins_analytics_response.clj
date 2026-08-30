(ns pinterest-rest-api.specs.top-video-pins-analytics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.top-video-pins-analytics-response-date-availability :refer :all]
            [pinterest-rest-api.specs.top-video-pins-analytics-response-pins-items :refer :all]
            [pinterest-rest-api.specs.top-video-pins-sort-by :refer :all]
            )
  (:import (java.io File)))


(def top-video-pins-analytics-response-data
  {
   (ds/opt :date_availability) top-video-pins-analytics-response-date-availability-spec
   (ds/opt :pins) (s/coll-of top-video-pins-analytics-response-pins-items-spec)
   (ds/opt :sort_by) top-video-pins-sort-by-spec
   })

(def top-video-pins-analytics-response-spec
  (ds/spec
    {:name ::top-video-pins-analytics-response
     :spec top-video-pins-analytics-response-data}))
