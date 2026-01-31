(ns pinterest-rest-api.specs.catalogs-hotel-report-stats-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-report-stats-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-report-stats-parameters-data
  {
   (ds/req :catalog_type) string?
   (ds/req :report) catalogs-hotel-report-stats-parameters-report-spec
   })

(def catalogs-hotel-report-stats-parameters-spec
  (ds/spec
    {:name ::catalogs-hotel-report-stats-parameters
     :spec catalogs-hotel-report-stats-parameters-data}))
