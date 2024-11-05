(ns pinterest-rest-api.specs.create-mmm-report-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            )
  (:import (java.io File)))


(def create-mmm-report-response-data-data
  {
   (ds/opt :report_status) bulk-reporting-job-status-spec
   (ds/opt :token) string?
   (ds/opt :message) string?
   (ds/opt :status) string?
   })

(def create-mmm-report-response-data-spec
  (ds/spec
    {:name ::create-mmm-report-response-data
     :spec create-mmm-report-response-data-data}))
