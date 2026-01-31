(ns pinterest-rest-api.specs.catalogs-creative-assets-filter-values-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-filter-values-map-data
  {
   (ds/opt :custom_label_0) (s/coll-of string?)
   (ds/opt :custom_label_1) (s/coll-of string?)
   (ds/opt :custom_label_2) (s/coll-of string?)
   (ds/opt :custom_label_3) (s/coll-of string?)
   (ds/opt :custom_label_4) (s/coll-of string?)
   (ds/opt :google_product_category_0) (s/coll-of string?)
   (ds/opt :google_product_category_1) (s/coll-of string?)
   (ds/opt :google_product_category_2) (s/coll-of string?)
   (ds/opt :google_product_category_3) (s/coll-of string?)
   (ds/opt :google_product_category_4) (s/coll-of string?)
   (ds/opt :google_product_category_5) (s/coll-of string?)
   (ds/opt :google_product_category_6) (s/coll-of string?)
   (ds/opt :media_type) (s/coll-of string?)
   })

(def catalogs-creative-assets-filter-values-map-spec
  (ds/spec
    {:name ::catalogs-creative-assets-filter-values-map
     :spec catalogs-creative-assets-filter-values-map-data}))
