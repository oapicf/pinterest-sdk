(ns pinterest-rest-api.specs.catalogs-retail-filter-values-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-availability :refer :all]
            [pinterest-rest-api.specs.product-condition :refer :all]
            [pinterest-rest-api.specs.gender :refer :all]
            [pinterest-rest-api.specs.media-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-filter-values-map-data
  {
   (ds/opt :ad_image_tags) (s/coll-of string?)
   (ds/opt :ad_video_tags) (s/coll-of string?)
   (ds/opt :availability) (s/coll-of product-availability-spec)
   (ds/opt :brand) (s/coll-of string?)
   (ds/opt :condition) (s/coll-of product-condition-spec)
   (ds/opt :custom_label_0) (s/coll-of string?)
   (ds/opt :custom_label_1) (s/coll-of string?)
   (ds/opt :custom_label_2) (s/coll-of string?)
   (ds/opt :custom_label_3) (s/coll-of string?)
   (ds/opt :custom_label_4) (s/coll-of string?)
   (ds/opt :gender) (s/coll-of gender-spec)
   (ds/opt :google_product_category_0) (s/coll-of string?)
   (ds/opt :google_product_category_1) (s/coll-of string?)
   (ds/opt :google_product_category_2) (s/coll-of string?)
   (ds/opt :google_product_category_3) (s/coll-of string?)
   (ds/opt :google_product_category_4) (s/coll-of string?)
   (ds/opt :google_product_category_5) (s/coll-of string?)
   (ds/opt :google_product_category_6) (s/coll-of string?)
   (ds/opt :media_type) (s/coll-of media-type-spec)
   (ds/opt :product_type_0) (s/coll-of string?)
   (ds/opt :product_type_1) (s/coll-of string?)
   (ds/opt :product_type_2) (s/coll-of string?)
   (ds/opt :product_type_3) (s/coll-of string?)
   (ds/opt :product_type_4) (s/coll-of string?)
   })

(def catalogs-retail-filter-values-map-spec
  (ds/spec
    {:name ::catalogs-retail-filter-values-map
     :spec catalogs-retail-filter-values-map-data}))
