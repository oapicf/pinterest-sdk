(ns pinterest-rest-api.specs.catalogs-vertical-product-group-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def catalogs-vertical-product-group-update-request-data
  {
   (ds/opt :catalog_type) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :country) country-spec
   (ds/opt :locale) catalogs-locale-spec
   })

(def catalogs-vertical-product-group-update-request-spec
  (ds/spec
    {:name ::catalogs-vertical-product-group-update-request
     :spec catalogs-vertical-product-group-update-request-data}))
