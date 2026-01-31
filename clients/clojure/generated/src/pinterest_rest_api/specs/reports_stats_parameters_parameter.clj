(ns pinterest-rest-api.specs.reports-stats-parameters-parameter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-report-stats-parameters-report :refer :all]
            )
  (:import (java.io File)))


(def reports-stats-parameters-parameter-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :report) catalogs-hotel-report-stats-parameters-report-spec
   })

(def reports-stats-parameters-parameter-spec
  (ds/spec
    {:name ::reports-stats-parameters-parameter
     :spec reports-stats-parameters-parameter-data}))
