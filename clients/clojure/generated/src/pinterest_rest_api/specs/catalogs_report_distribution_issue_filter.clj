(ns pinterest-rest-api.specs.catalogs-report-distribution-issue-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-distribution-issue-filter-data
  {
   (ds/req :report_type) string?
   (ds/opt :catalog_id) string?
   })

(def catalogs-report-distribution-issue-filter-spec
  (ds/spec
    {:name ::catalogs-report-distribution-issue-filter
     :spec catalogs-report-distribution-issue-filter-data}))
