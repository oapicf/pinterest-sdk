(ns pinterest-rest-api.specs.catalogs-retail-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-status :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-product-group-data
  {
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :country) string?
   (ds/opt :created_at) int?
   (ds/opt :description) string?
   (ds/req :feed_id) string?
   (ds/req :filters) catalogs-product-group-filters-spec
   (ds/req :id) string?
   (ds/opt :is_featured) boolean?
   (ds/opt :locale) string?
   (ds/opt :name) string?
   (ds/opt :status) catalogs-product-group-status-spec
   (ds/req :type) catalogs-product-group-type-spec
   (ds/opt :updated_at) int?
   })

(def catalogs-retail-product-group-spec
  (ds/spec
    {:name ::catalogs-retail-product-group
     :spec catalogs-retail-product-group-data}))
