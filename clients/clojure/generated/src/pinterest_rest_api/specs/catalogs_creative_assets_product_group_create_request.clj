(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-create-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/req :catalog_id) string?
   })

(def catalogs-creative-assets-product-group-create-request-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group-create-request
     :spec catalogs-creative-assets-product-group-create-request-data}))
