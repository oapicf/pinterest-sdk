(ns pinterest-rest-api.specs.catalogs-creative-assets-product
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-metadata :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-data
  {
   (ds/req :catalog_type) string?
   (ds/req :metadata) catalogs-creative-assets-product-metadata-spec
   (ds/req :pin) pin-spec
   })

(def catalogs-creative-assets-product-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product
     :spec catalogs-creative-assets-product-data}))
