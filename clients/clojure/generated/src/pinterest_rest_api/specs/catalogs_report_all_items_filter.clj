(ns pinterest-rest-api.specs.catalogs-report-all-items-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-all-items-filter-data
  {
   (ds/opt :catalog_id) string?
   (ds/req :report_type) string?
   })

(def catalogs-report-all-items-filter-spec
  (ds/spec
    {:name ::catalogs-report-all-items-filter
     :spec catalogs-report-all-items-filter-data}))
