(ns pinterest-rest-api.specs.catalogs-hotel-product-group-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-group-update-request-data
  {
   (ds/opt :catalog_type) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :filters) catalogs-hotel-product-group-filters-spec
   })

(def catalogs-hotel-product-group-update-request-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group-update-request
     :spec catalogs-hotel-product-group-update-request-data}))
