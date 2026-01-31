(ns pinterest-rest-api.specs.catalogs-vertical-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-status :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-vertical-product-group-data
  {
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :country) string?
   (ds/opt :created_at) int?
   (ds/opt :description) string?
   (ds/req :feed_id) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/req :id) string?
   (ds/opt :is_featured) boolean?
   (ds/opt :locale) string?
   (ds/opt :name) string?
   (ds/opt :status) catalogs-product-group-status-spec
   (ds/req :type) catalogs-hotel-product-group-type-spec
   (ds/opt :updated_at) int?
   })

(def catalogs-vertical-product-group-spec
  (ds/spec
    {:name ::catalogs-vertical-product-group
     :spec catalogs-vertical-product-group-data}))
