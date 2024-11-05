(ns pinterest-rest-api.specs.catalogs-hotel-product
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-product-metadata :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-data
  {
   (ds/req :catalog_type) string?
   (ds/req :metadata) catalogs-hotel-product-metadata-spec
   (ds/req :pin) pin-spec
   })

(def catalogs-hotel-product-spec
  (ds/spec
    {:name ::catalogs-hotel-product
     :spec catalogs-hotel-product-data}))
