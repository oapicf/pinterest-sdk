(ns pinterest-rest-api.specs.bulk-upsert-request-create-catalog-product-groups-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-request-create-catalog-product-groups-items-data
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

(def bulk-upsert-request-create-catalog-product-groups-items-spec
  (ds/spec
    {:name ::bulk-upsert-request-create-catalog-product-groups-items
     :spec bulk-upsert-request-create-catalog-product-groups-items-data}))
