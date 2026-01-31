(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-data
  {
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :created_at) int?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :updated_at) int?
   })

(def catalogs-creative-assets-product-group-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group
     :spec catalogs-creative-assets-product-group-data}))
