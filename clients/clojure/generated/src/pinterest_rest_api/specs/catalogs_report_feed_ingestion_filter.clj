(ns pinterest-rest-api.specs.catalogs-report-feed-ingestion-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-feed-ingestion-filter-data
  {
   (ds/req :report_type) string?
   (ds/req :feed_id) string?
   (ds/opt :processing_result_id) string?
   })

(def catalogs-report-feed-ingestion-filter-spec
  (ds/spec
    {:name ::catalogs-report-feed-ingestion-filter
     :spec catalogs-report-feed-ingestion-filter-data}))
