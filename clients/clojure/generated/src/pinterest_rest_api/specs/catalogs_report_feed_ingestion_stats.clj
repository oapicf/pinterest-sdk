(ns pinterest-rest-api.specs.catalogs-report-feed-ingestion-stats
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-feed-ingestion-stats-data
  {
   (ds/opt :report_type) string?
   (ds/opt :catalog_id) string?
   (ds/opt :code) int?
   (ds/opt :code_label) string?
   (ds/opt :message) string?
   (ds/opt :occurrences) int?
   (ds/opt :severity) string?
   })

(def catalogs-report-feed-ingestion-stats-spec
  (ds/spec
    {:name ::catalogs-report-feed-ingestion-stats
     :spec catalogs-report-feed-ingestion-stats-data}))
