(ns pinterest-rest-api.specs.catalogs-product-group-product-counts-vertical
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-product-counts-vertical-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :in_stock) float?
   (ds/req :out_of_stock) float?
   (ds/req :preorder) float?
   (ds/req :total) float?
   (ds/req :videos) float?
   })

(def catalogs-product-group-product-counts-vertical-spec
  (ds/spec
    {:name ::catalogs-product-group-product-counts-vertical
     :spec catalogs-product-group-product-counts-vertical-data}))
