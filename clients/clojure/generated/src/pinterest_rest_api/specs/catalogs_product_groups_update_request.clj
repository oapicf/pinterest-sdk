(ns pinterest-rest-api.specs.catalogs-product-groups-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-groups-update-request-data
  {
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :is_featured) boolean?
   (ds/opt :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :catalog_type) string?
   (ds/opt :country) country-spec
   (ds/opt :locale) catalogs-locale-spec
   })

(def catalogs-product-groups-update-request-spec
  (ds/spec
    {:name ::catalogs-product-groups-update-request
     :spec catalogs-product-groups-update-request-data}))
