(ns pinterest-rest-api.specs.trending-keywords-response-trends-inner-time-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trending-keywords-response-trends-inner-time-series-data
  {
   (ds/opt :date) inst?
   })

(def trending-keywords-response-trends-inner-time-series-spec
  (ds/spec
    {:name ::trending-keywords-response-trends-inner-time-series
     :spec trending-keywords-response-trends-inner-time-series-data}))
