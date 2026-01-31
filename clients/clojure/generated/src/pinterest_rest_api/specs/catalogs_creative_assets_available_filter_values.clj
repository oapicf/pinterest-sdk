(ns pinterest-rest-api.specs.catalogs-creative-assets-available-filter-values
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-filter-values-map :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-available-filter-values-data
  {
   (ds/req :catalog_type) string?
   (ds/req :filter_values) catalogs-creative-assets-filter-values-map-spec
   })

(def catalogs-creative-assets-available-filter-values-spec
  (ds/spec
    {:name ::catalogs-creative-assets-available-filter-values
     :spec catalogs-creative-assets-available-filter-values-data}))
