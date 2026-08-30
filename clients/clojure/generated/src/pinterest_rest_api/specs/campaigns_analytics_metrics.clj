(ns pinterest-rest-api.specs.campaigns-analytics-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaigns-analytics-metrics-data
  {
   (ds/opt :CAMPAIGN_ID) string?
   (ds/opt :DATE) inst?
   })

(def campaigns-analytics-metrics-spec
  (ds/spec
    {:name ::campaigns-analytics-metrics
     :spec campaigns-analytics-metrics-data}))
