(ns pinterest-rest-api.specs.ads-analytics-create-async-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-create-async-response-data
  {
   (ds/opt :report_status) string?
   (ds/opt :token) string?
   (ds/opt :message) string?
   })

(def ads-analytics-create-async-response-spec
  (ds/spec
    {:name ::ads-analytics-create-async-response
     :spec ads-analytics-create-async-response-data}))
