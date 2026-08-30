(ns pinterest-rest-api.specs.catalogs-product-groups-create-many-request-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-groups-create-many-request-items-data
  {
   (ds/opt :description) string?
   (ds/req :feed_id) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :is_featured) boolean?
   (ds/req :name) string?
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :country) country-spec
   (ds/opt :locale) catalogs-locale-spec
   })

(def catalogs-product-groups-create-many-request-items-spec
  (ds/spec
    {:name ::catalogs-product-groups-create-many-request-items
     :spec catalogs-product-groups-create-many-request-items-data}))
