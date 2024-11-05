(ns pinterest-rest-api.specs.catalogs-product-group-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-create-request-data
  {
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/opt :is_featured) boolean?
   (ds/req :filters) catalogs-product-group-filters-request-spec
   (ds/req :feed_id) string?
   })

(def catalogs-product-group-create-request-spec
  (ds/spec
    {:name ::catalogs-product-group-create-request
     :spec catalogs-product-group-create-request-data}))
