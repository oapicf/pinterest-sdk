(ns pinterest-rest-api.specs.catalogs-hotel-report-stats-parameters-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-report-stats-parameters-report-data
  {
   (ds/req :feed_id) string?
   (ds/opt :processing_result_id) string?
   (ds/req :report_type) string?
   (ds/opt :catalog_id) string?
   })

(def catalogs-hotel-report-stats-parameters-report-spec
  (ds/spec
    {:name ::catalogs-hotel-report-stats-parameters-report
     :spec catalogs-hotel-report-stats-parameters-report-data}))
