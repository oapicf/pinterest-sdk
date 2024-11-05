(ns pinterest-rest-api.specs.catalogs-retail-product
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-retail-product-metadata :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-product-data
  {
   (ds/req :catalog_type) string?
   (ds/req :metadata) catalogs-retail-product-metadata-spec
   (ds/req :pin) pin-spec
   })

(def catalogs-retail-product-spec
  (ds/spec
    {:name ::catalogs-retail-product
     :spec catalogs-retail-product-data}))
