(ns pinterest-rest-api.specs.catalogs-product-group-product-counts-vertical
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-product-counts-vertical-data
  {
   (ds/req :catalog_type) string?
   (ds/req :in_stock) float?
   (ds/req :out_of_stock) float?
   (ds/req :preorder) float?
   (ds/req :total) float?
   (ds/req :videos) float?
   (ds/req :app_links) float?
   (ds/req :images) float?
   })

(def catalogs-product-group-product-counts-vertical-spec
  (ds/spec
    {:name ::catalogs-product-group-product-counts-vertical
     :spec catalogs-product-group-product-counts-vertical-data}))
