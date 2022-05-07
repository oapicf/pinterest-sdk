(ns pinterest-rest-api.specs.catalogs-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-type :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-data
  {
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-product-group-filters-spec
   (ds/opt :type) catalogs-product-group-type-spec
   (ds/opt :status) catalogs-product-group-status-spec
   (ds/opt :feed_id) string?
   (ds/opt :created_at) int?
   (ds/opt :updated_at) int?
   })

(def catalogs-product-group-spec
  (ds/spec
    {:name ::catalogs-product-group
     :spec catalogs-product-group-data}))
