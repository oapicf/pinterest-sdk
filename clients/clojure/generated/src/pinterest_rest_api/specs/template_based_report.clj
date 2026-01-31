(ns pinterest-rest-api.specs.template-based-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-reporting-job-status :refer :all]
            )
  (:import (java.io File)))


(def template-based-report-data
  {
   (ds/opt :message) string?
   (ds/req :report_status) bulk-reporting-job-status-spec
   (ds/req :template_id) string?
   (ds/opt :token) string?
   })

(def template-based-report-spec
  (ds/spec
    {:name ::template-based-report
     :spec template-based-report-data}))
