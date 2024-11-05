(ns pinterest-rest-api.specs.catalogs-hotel-report-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-report-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-report-parameters-data
  {
   (ds/req :catalog_type) string?
   (ds/req :report) catalogs-hotel-report-parameters-report-spec
   })

(def catalogs-hotel-report-parameters-spec
  (ds/spec
    {:name ::catalogs-hotel-report-parameters
     :spec catalogs-hotel-report-parameters-data}))
