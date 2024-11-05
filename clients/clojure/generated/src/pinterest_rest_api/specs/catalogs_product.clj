(ns pinterest-rest-api.specs.catalogs-product
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-metadata :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :metadata) catalogs-creative-assets-product-metadata-spec
   (ds/req :pin) pin-spec
   })

(def catalogs-product-spec
  (ds/spec
    {:name ::catalogs-product
     :spec catalogs-product-data}))
