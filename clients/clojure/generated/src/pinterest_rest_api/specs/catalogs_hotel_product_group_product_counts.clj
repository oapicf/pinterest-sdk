(ns pinterest-rest-api.specs.catalogs-hotel-product-group-product-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-group-product-counts-data
  {
   (ds/req :catalog_type) string?
   (ds/req :total) float?
   })

(def catalogs-hotel-product-group-product-counts-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group-product-counts
     :spec catalogs-hotel-product-group-product-counts-data}))
