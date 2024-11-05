(ns pinterest-rest-api.specs.catalogs-list-products-by-filter-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def catalogs-list-products-by-filter-request-data
  {
   (ds/req :feed_id) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/req :catalog_type) string?
   (ds/req :catalog_id) string?
   (ds/req :country) country-spec
   (ds/req :locale) catalogs-locale-spec
   })

(def catalogs-list-products-by-filter-request-spec
  (ds/spec
    {:name ::catalogs-list-products-by-filter-request
     :spec catalogs-list-products-by-filter-request-data}))
