(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-update-request-data
  {
   (ds/opt :catalog_type) string?
   (ds/opt :description) string?
   (ds/opt :filters) catalogs-creative-assets-product-group-filters-spec
   (ds/opt :name) string?
   })

(def catalogs-creative-assets-product-group-update-request-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group-update-request
     :spec catalogs-creative-assets-product-group-update-request-data}))
