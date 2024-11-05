(ns pinterest-rest-api.specs.catalogs-retail-report-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-report-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-report-parameters-data
  {
   (ds/req :catalog_type) string?
   (ds/req :report) catalogs-hotel-report-parameters-report-spec
   })

(def catalogs-retail-report-parameters-spec
  (ds/spec
    {:name ::catalogs-retail-report-parameters
     :spec catalogs-retail-report-parameters-data}))
