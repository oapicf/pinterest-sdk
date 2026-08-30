(ns pinterest-rest-api.specs.catalogs-retail-report-all-items-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-retail-report-all-items-filter-data
  {
   (ds/opt :catalog_id) string?
   (ds/opt :product_group_id) string?
   (ds/req :report_type) string?
   })

(def catalogs-retail-report-all-items-filter-spec
  (ds/spec
    {:name ::catalogs-retail-report-all-items-filter
     :spec catalogs-retail-report-all-items-filter-data}))
