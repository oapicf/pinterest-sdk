(ns pinterest-rest-api.specs.catalogs-report-stats-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-report-stats-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-report-stats-parameters-data
  {
   (ds/req :catalog_type) string?
   (ds/req :report) catalogs-hotel-report-stats-parameters-report-spec
   })

(def catalogs-report-stats-parameters-spec
  (ds/spec
    {:name ::catalogs-report-stats-parameters
     :spec catalogs-report-stats-parameters-data}))
