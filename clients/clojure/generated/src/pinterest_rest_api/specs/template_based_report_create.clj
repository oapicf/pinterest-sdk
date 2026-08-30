(ns pinterest-rest-api.specs.template-based-report-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            )
  (:import (java.io File)))


(def template-based-report-create-data
  {
   (ds/opt :message) string?
   (ds/req :report_status) bulk-reporting-job-status-spec
   (ds/opt :token) string?
   })

(def template-based-report-create-spec
  (ds/spec
    {:name ::template-based-report-create
     :spec template-based-report-create-data}))
