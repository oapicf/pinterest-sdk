(ns pinterest-rest-api.specs.catalogs-report-distribution-stats
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-distribution-stats-data
  {
   (ds/opt :report_type) string?
   (ds/opt :catalog_id) string?
   (ds/opt :code) int?
   (ds/opt :code_label) string?
   (ds/opt :message) string?
   (ds/opt :occurrences) int?
   (ds/opt :ineligible_for_ads) boolean?
   (ds/opt :ineligible_for_organic) boolean?
   })

(def catalogs-report-distribution-stats-spec
  (ds/spec
    {:name ::catalogs-report-distribution-stats
     :spec catalogs-report-distribution-stats-data}))
