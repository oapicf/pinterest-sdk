(ns pinterest-rest-api.specs.catalogs-retail-report-stats-parameters-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-retail-report-stats-parameters-report-data
  {
   (ds/req :feed_id) string?
   (ds/opt :processing_result_id) string?
   (ds/req :report_type) string?
   (ds/opt :catalog_id) string?
   })

(def catalogs-retail-report-stats-parameters-report-spec
  (ds/spec
    {:name ::catalogs-retail-report-stats-parameters-report
     :spec catalogs-retail-report-stats-parameters-report-data}))
