(ns pinterest-rest-api.specs.catalogs-retail-product-group-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters-request :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-locale :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-product-group-create-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/req :filters) catalogs-product-group-filters-request-spec
   (ds/req :catalog_id) string?
   (ds/req :country) country-spec
   (ds/req :locale) catalogs-locale-spec
   })

(def catalogs-retail-product-group-create-request-spec
  (ds/spec
    {:name ::catalogs-retail-product-group-create-request
     :spec catalogs-retail-product-group-create-request-data}))
