(ns pinterest-rest-api.specs.trending-keywords-response-trends-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trending-keywords-response-trends-inner-time-series :refer :all]
            )
  (:import (java.io File)))


(def trending-keywords-response-trends-inner-data
  {
   (ds/opt :keyword) string?
   (ds/opt :pct_growth_wow) int?
   (ds/opt :pct_growth_mom) int?
   (ds/opt :pct_growth_yoy) int?
   (ds/opt :time_series) trending-keywords-response-trends-inner-time-series-spec
   })

(def trending-keywords-response-trends-inner-spec
  (ds/spec
    {:name ::trending-keywords-response-trends-inner
     :spec trending-keywords-response-trends-inner-data}))
