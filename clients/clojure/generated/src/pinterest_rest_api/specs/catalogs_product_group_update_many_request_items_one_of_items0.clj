(ns pinterest-rest-api.specs.catalogs-product-group-update-many-request-items-one-of-items0
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-update-many-request-items-one-of-items0-data
  {
   (ds/opt :description) string?
   (ds/opt :filters) catalogs-product-group-filters-request-spec
   (ds/opt :is_featured) boolean?
   (ds/opt :name) string?
   (ds/req :id) string?
   })

(def catalogs-product-group-update-many-request-items-one-of-items0-spec
  (ds/spec
    {:name ::catalogs-product-group-update-many-request-items-one-of-items0
     :spec catalogs-product-group-update-many-request-items-one-of-items0-data}))
