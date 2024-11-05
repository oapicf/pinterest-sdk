(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-data
  {
   (ds/req :catalog_type) string?
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :created_at) int?
   (ds/opt :updated_at) int?
   (ds/req :catalog_id) string?
   })

(def catalogs-creative-assets-product-group-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group
     :spec catalogs-creative-assets-product-group-data}))
