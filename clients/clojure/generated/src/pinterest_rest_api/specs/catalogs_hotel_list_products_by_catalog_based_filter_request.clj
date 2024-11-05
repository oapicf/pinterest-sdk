(ns pinterest-rest-api.specs.catalogs-hotel-list-products-by-catalog-based-filter-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-list-products-by-catalog-based-filter-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :catalog_id) string?
   (ds/req :filters) catalogs-hotel-product-group-filters-spec
   })

(def catalogs-hotel-list-products-by-catalog-based-filter-request-spec
  (ds/spec
    {:name ::catalogs-hotel-list-products-by-catalog-based-filter-request
     :spec catalogs-hotel-list-products-by-catalog-based-filter-request-data}))
