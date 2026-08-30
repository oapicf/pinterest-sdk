(ns pinterest-rest-api.specs.mmm-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            )
  (:import (java.io File)))


(def mmm-report-data
  {
   (ds/opt :message) string?
   (ds/opt :report_status) bulk-reporting-job-status-spec
   (ds/opt :size) float?
   (ds/opt :status) string?
   (ds/opt :token) string?
   (ds/opt :url) string?
   })

(def mmm-report-spec
  (ds/spec
    {:name ::mmm-report
     :spec mmm-report-data}))
