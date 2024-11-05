(ns pinterest-rest-api.specs.item-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-attributes-data
  {
   (ds/opt :ad_link) string?
   (ds/opt :adult) boolean?
   (ds/opt :age_group) string?
   (ds/opt :availability) string?
   (ds/opt :average_review_rating) float?
   (ds/opt :brand) string?
   (ds/opt :checkout_enabled) boolean?
   (ds/opt :color) string?
   (ds/opt :condition) string?
   (ds/opt :custom_label_0) string?
   (ds/opt :custom_label_1) string?
   (ds/opt :custom_label_2) string?
   (ds/opt :custom_label_3) string?
   (ds/opt :custom_label_4) string?
   (ds/opt :description) string?
   (ds/opt :free_shipping_label) boolean?
   (ds/opt :free_shipping_limit) string?
   (ds/opt :gender) string?
   (ds/opt :google_product_category) string?
   (ds/opt :gtin) int?
   (ds/opt :id) string?
   (ds/opt :item_group_id) string?
   (ds/opt :last_updated_time) int?
   (ds/opt :link) string?
   (ds/opt :material) string?
   (ds/opt :min_ad_price) string?
   (ds/opt :mobile_link) string?
   (ds/opt :mpn) string?
   (ds/opt :number_of_ratings) int?
   (ds/opt :number_of_reviews) int?
   (ds/opt :pattern) string?
   (ds/opt :price) string?
   (ds/opt :product_type) string?
   (ds/opt :sale_price) string?
   (ds/opt :shipping) string?
   (ds/opt :shipping_height) string?
   (ds/opt :shipping_weight) string?
   (ds/opt :shipping_width) string?
   (ds/opt :size) string?
   (ds/opt :size_system) string?
   (ds/opt :size_type) string?
   (ds/opt :tax) string?
   (ds/opt :title) string?
   (ds/opt :variant_names) (s/coll-of string?)
   (ds/opt :variant_values) (s/coll-of string?)
   (ds/opt :additional_image_link) (s/coll-of string?)
   (ds/opt :image_link) (s/coll-of string?)
   (ds/opt :video_link) string?
   })

(def item-attributes-spec
  (ds/spec
    {:name ::item-attributes
     :spec item-attributes-data}))
