(ns pinterest-rest-api.specs.catalogs-report-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-report-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def catalogs-report-parameters-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :report) catalogs-hotel-report-parameters-report-spec
   })

(def catalogs-report-parameters-spec
  (ds/spec
    {:name ::catalogs-report-parameters
     :spec catalogs-report-parameters-data}))
