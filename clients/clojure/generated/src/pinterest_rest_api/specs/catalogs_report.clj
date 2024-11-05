(ns pinterest-rest-api.specs.catalogs-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-report-data
  {
   (ds/opt :report_status) string?
   (ds/opt :url) string?
   (ds/opt :size) float?
   })

(def catalogs-report-spec
  (ds/spec
    {:name ::catalogs-report
     :spec catalogs-report-data}))
