(ns pinterest-rest-api.specs.catalogs-report-stats
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-stats-data
  {
   (ds/req :report_type) string?
   (ds/opt :catalog_id) string?
   (ds/opt :code) int?
   (ds/opt :code_label) string?
   (ds/opt :message) string?
   (ds/opt :occurrences) int?
   (ds/opt :severity) string?
   (ds/opt :ineligible_for_ads) boolean?
   (ds/opt :ineligible_for_organic) boolean?
   })

(def catalogs-report-stats-spec
  (ds/spec
    {:name ::catalogs-report-stats
     :spec catalogs-report-stats-data}))
