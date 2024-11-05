(ns pinterest-rest-api.specs.catalogs-retail-product-group-product-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-retail-product-group-product-counts-data
  {
   (ds/req :catalog_type) string?
   (ds/req :in_stock) float?
   (ds/req :out_of_stock) float?
   (ds/req :preorder) float?
   (ds/req :total) float?
   (ds/opt :videos) float?
   })

(def catalogs-retail-product-group-product-counts-spec
  (ds/spec
    {:name ::catalogs-retail-product-group-product-counts
     :spec catalogs-retail-product-group-product-counts-data}))
