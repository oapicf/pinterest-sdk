(ns pinterest-rest-api.specs.trending-keyword
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trending-keyword-demographics :refer :all]
            [pinterest-rest-api.specs.predicted-time-series :refer :all]
            [pinterest-rest-api.specs.time-series :refer :all]
            )
  (:import (java.io File)))


(def trending-keyword-data
  {
   (ds/opt :demographics) trending-keyword-demographics-spec
   (ds/opt :has_prediction) boolean?
   (ds/opt :keyword) string?
   (ds/opt :pct_growth_mom) int?
   (ds/opt :pct_growth_wow) int?
   (ds/opt :pct_growth_yoy) int?
   (ds/opt :predicted_time_series) predicted-time-series-spec
   (ds/opt :time_series) time-series-spec
   })

(def trending-keyword-spec
  (ds/spec
    {:name ::trending-keyword
     :spec trending-keyword-data}))
