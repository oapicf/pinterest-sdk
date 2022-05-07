(ns pinterest-rest-api.specs.ads-analytics-get-async-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-get-async-response-data
  {
   (ds/opt :report_status) string?
   (ds/opt :url) string?
   (ds/opt :size) float?
   })

(def ads-analytics-get-async-response-spec
  (ds/spec
    {:name ::ads-analytics-get-async-response
     :spec ads-analytics-get-async-response-data}))
