(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group-product-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-product-counts-data
  {
   (ds/req :app_links) float?
   (ds/req :catalog_type) string?
   (ds/req :images) float?
   (ds/req :total) float?
   (ds/req :videos) float?
   })

(def catalogs-creative-assets-product-group-product-counts-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group-product-counts
     :spec catalogs-creative-assets-product-group-product-counts-data}))
