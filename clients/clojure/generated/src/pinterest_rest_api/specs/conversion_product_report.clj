(ns pinterest-rest-api.specs.conversion-product-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            )
  (:import (java.io File)))


(def conversion-product-report-data
  {
   (ds/opt :message) string?
   (ds/opt :report_status) bulk-reporting-job-status-spec
   (ds/opt :size) float?
   (ds/opt :token) string?
   (ds/opt :url) string?
   })

(def conversion-product-report-spec
  (ds/spec
    {:name ::conversion-product-report
     :spec conversion-product-report-data}))
