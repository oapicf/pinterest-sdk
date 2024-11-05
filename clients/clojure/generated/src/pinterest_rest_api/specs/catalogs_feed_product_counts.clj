(ns pinterest-rest-api.specs.catalogs-feed-product-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-product-counts-data
  {
   (ds/opt :original) int?
   (ds/opt :ingested) int?
   })

(def catalogs-feed-product-counts-spec
  (ds/spec
    {:name ::catalogs-feed-product-counts
     :spec catalogs-feed-product-counts-data}))
