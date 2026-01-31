(ns pinterest-rest-api.specs.catalogs-hotel-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-group-data
  {
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :created_at) int?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-hotel-product-group-filters-spec
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/req :type) catalogs-hotel-product-group-type-spec
   (ds/opt :updated_at) int?
   })

(def catalogs-hotel-product-group-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group
     :spec catalogs-hotel-product-group-data}))
