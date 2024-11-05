(ns pinterest-rest-api.specs.catalogs-creative-assets-list-products-by-catalog-based-filter-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-list-products-by-catalog-based-filter-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :catalog_id) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   })

(def catalogs-creative-assets-list-products-by-catalog-based-filter-request-spec
  (ds/spec
    {:name ::catalogs-creative-assets-list-products-by-catalog-based-filter-request
     :spec catalogs-creative-assets-list-products-by-catalog-based-filter-request-data}))
