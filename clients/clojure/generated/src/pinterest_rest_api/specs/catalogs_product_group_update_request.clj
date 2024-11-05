(ns pinterest-rest-api.specs.catalogs-product-group-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-update-request-data
  {
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :is_featured) boolean?
   (ds/opt :filters) catalogs-product-group-filters-request-spec
   })

(def catalogs-product-group-update-request-spec
  (ds/spec
    {:name ::catalogs-product-group-update-request
     :spec catalogs-product-group-update-request-data}))
