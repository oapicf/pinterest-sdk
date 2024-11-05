(ns pinterest-rest-api.specs.get-mmm-report-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-mmm-report-response-data-data
  {
   (ds/opt :report_status) string?
   (ds/opt :url) string?
   (ds/opt :size) float?
   })

(def get-mmm-report-response-data-spec
  (ds/spec
    {:name ::get-mmm-report-response-data
     :spec get-mmm-report-response-data-data}))
