(ns pinterest-rest-api.specs.keyword-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keyword-metrics-data
  {
   (ds/opt :avg_cpc_in_micro_currency) float?
   (ds/opt :keyword_query_volume) string?
   })

(def keyword-metrics-spec
  (ds/spec
    {:name ::keyword-metrics
     :spec keyword-metrics-data}))
