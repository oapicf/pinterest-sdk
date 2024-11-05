(ns pinterest-rest-api.specs.catalogs-vertical-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-type :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-vertical-product-group-data
  {
   (ds/req :catalog_type) string?
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :is_featured) boolean?
   (ds/opt :type) catalogs-product-group-type-spec
   (ds/opt :status) catalogs-product-group-status-spec
   (ds/opt :created_at) int?
   (ds/opt :updated_at) int?
   (ds/req :catalog_id) string?
   (ds/req :feed_id) string?
   (ds/opt :country) string?
   (ds/opt :locale) string?
   })

(def catalogs-vertical-product-group-spec
  (ds/spec
    {:name ::catalogs-vertical-product-group
     :spec catalogs-vertical-product-group-data}))
