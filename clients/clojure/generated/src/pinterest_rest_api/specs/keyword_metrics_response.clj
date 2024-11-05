(ns pinterest-rest-api.specs.keyword-metrics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-metrics :refer :all]
            )
  (:import (java.io File)))


(def keyword-metrics-response-data
  {
   (ds/opt :keyword) string?
   (ds/opt :metrics) keyword-metrics-spec
   })

(def keyword-metrics-response-spec
  (ds/spec
    {:name ::keyword-metrics-response
     :spec keyword-metrics-response-data}))
