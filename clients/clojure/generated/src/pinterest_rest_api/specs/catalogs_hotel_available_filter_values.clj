(ns pinterest-rest-api.specs.catalogs-hotel-available-filter-values
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-filter-values-map :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-available-filter-values-data
  {
   (ds/req :catalog_type) string?
   (ds/req :filter_values) catalogs-hotel-filter-values-map-spec
   })

(def catalogs-hotel-available-filter-values-spec
  (ds/spec
    {:name ::catalogs-hotel-available-filter-values
     :spec catalogs-hotel-available-filter-values-data}))
