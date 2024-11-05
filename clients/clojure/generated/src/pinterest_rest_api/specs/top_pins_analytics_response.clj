(ns pinterest-rest-api.specs.top-pins-analytics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.top-pins-analytics-response-date-availability :refer :all]
            [pinterest-rest-api.specs.top-pins-analytics-response-pins-inner :refer :all]
            )
  (:import (java.io File)))


(def top-pins-analytics-response-data
  {
   (ds/opt :date_availability) top-pins-analytics-response-date-availability-spec
   (ds/opt :pins) (s/coll-of top-pins-analytics-response-pins-inner-spec)
   (ds/opt :sort_by) string?
   })

(def top-pins-analytics-response-spec
  (ds/spec
    {:name ::top-pins-analytics-response
     :spec top-pins-analytics-response-data}))
