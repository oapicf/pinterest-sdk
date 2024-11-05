(ns pinterest-rest-api.specs.catalogs-hotel-report-parameters-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-report-parameters-report-data
  {
   (ds/opt :report_type) string?
   (ds/req :feed_id) string?
   (ds/opt :processing_result_id) string?
   (ds/opt :catalog_id) string?
   })

(def catalogs-hotel-report-parameters-report-spec
  (ds/spec
    {:name ::catalogs-hotel-report-parameters-report
     :spec catalogs-hotel-report-parameters-report-data}))
