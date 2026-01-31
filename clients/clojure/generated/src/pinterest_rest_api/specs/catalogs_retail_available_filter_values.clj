(ns pinterest-rest-api.specs.catalogs-retail-available-filter-values
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-retail-filter-values-map :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-available-filter-values-data
  {
   (ds/req :catalog_type) string?
   (ds/req :filter_values) catalogs-retail-filter-values-map-spec
   })

(def catalogs-retail-available-filter-values-spec
  (ds/spec
    {:name ::catalogs-retail-available-filter-values
     :spec catalogs-retail-available-filter-values-data}))
