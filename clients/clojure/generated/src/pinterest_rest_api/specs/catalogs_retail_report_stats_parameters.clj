(ns pinterest-rest-api.specs.catalogs-retail-report-stats-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-retail-report-stats-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-report-stats-parameters-data
  {
   (ds/req :catalog_type) string?
   (ds/req :report) catalogs-retail-report-stats-parameters-report-spec
   })

(def catalogs-retail-report-stats-parameters-spec
  (ds/spec
    {:name ::catalogs-retail-report-stats-parameters
     :spec catalogs-retail-report-stats-parameters-data}))
