(ns pinterest-rest-api.specs.updatable-item-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.updatable-item-attributes-gtin :refer :all]
            )
  (:import (java.io File)))


(def updatable-item-attributes-data
  {
   (ds/opt :ad_image_0_link) string?
   (ds/opt :ad_image_0_tag) string?
   (ds/opt :ad_image_10_link) string?
   (ds/opt :ad_image_10_tag) string?
   (ds/opt :ad_image_11_link) string?
   (ds/opt :ad_image_11_tag) string?
   (ds/opt :ad_image_12_link) string?
   (ds/opt :ad_image_12_tag) string?
   (ds/opt :ad_image_13_link) string?
   (ds/opt :ad_image_13_tag) string?
   (ds/opt :ad_image_14_link) string?
   (ds/opt :ad_image_14_tag) string?
   (ds/opt :ad_image_15_link) string?
   (ds/opt :ad_image_15_tag) string?
   (ds/opt :ad_image_16_link) string?
   (ds/opt :ad_image_16_tag) string?
   (ds/opt :ad_image_17_link) string?
   (ds/opt :ad_image_17_tag) string?
   (ds/opt :ad_image_18_link) string?
   (ds/opt :ad_image_18_tag) string?
   (ds/opt :ad_image_19_link) string?
   (ds/opt :ad_image_19_tag) string?
   (ds/opt :ad_image_1_link) string?
   (ds/opt :ad_image_1_tag) string?
   (ds/opt :ad_image_2_link) string?
   (ds/opt :ad_image_2_tag) string?
   (ds/opt :ad_image_3_link) string?
   (ds/opt :ad_image_3_tag) string?
   (ds/opt :ad_image_4_link) string?
   (ds/opt :ad_image_4_tag) string?
   (ds/opt :ad_image_5_link) string?
   (ds/opt :ad_image_5_tag) string?
   (ds/opt :ad_image_6_link) string?
   (ds/opt :ad_image_6_tag) string?
   (ds/opt :ad_image_7_link) string?
   (ds/opt :ad_image_7_tag) string?
   (ds/opt :ad_image_8_link) string?
   (ds/opt :ad_image_8_tag) string?
   (ds/opt :ad_image_9_link) string?
   (ds/opt :ad_image_9_tag) string?
   (ds/opt :ad_link) string?
   (ds/opt :ad_video_0_link) string?
   (ds/opt :ad_video_0_tag) string?
   (ds/opt :ad_video_1_link) string?
   (ds/opt :ad_video_1_tag) string?
   (ds/opt :ad_video_2_link) string?
   (ds/opt :ad_video_2_tag) string?
   (ds/opt :adult) boolean?
   (ds/opt :age_group) string?
   (ds/opt :android_deep_link) string?
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
   (ds/opt :custom_number_0) int?
   (ds/opt :custom_number_1) int?
   (ds/opt :custom_number_2) int?
   (ds/opt :custom_number_3) int?
   (ds/opt :custom_number_4) int?
   (ds/opt :description) string?
   (ds/opt :free_shipping_label) boolean?
   (ds/opt :free_shipping_limit) string?
   (ds/opt :gender) string?
   (ds/opt :google_product_category) string?
   (ds/opt :gtin) updatable-item-attributes-gtin-spec
   (ds/opt :id) string?
   (ds/opt :installment_price) string?
   (ds/opt :ios_deep_link) string?
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
   (ds/opt :promotion_id) string?
   (ds/opt :sale_price) string?
   (ds/opt :sale_price_effective_date) string?
   (ds/opt :shipping) string?
   (ds/opt :shipping_height) string?
   (ds/opt :shipping_weight) string?
   (ds/opt :shipping_width) string?
   (ds/opt :size) string?
   (ds/opt :size_system) string?
   (ds/opt :size_type) string?
   (ds/opt :tax) string?
   (ds/opt :title) string?
   (ds/opt :unit_pricing_base_measure) string?
   (ds/opt :unit_pricing_measure) string?
   (ds/opt :variant_names) (s/coll-of string?)
   (ds/opt :variant_values) (s/coll-of string?)
   })

(def updatable-item-attributes-spec
  (ds/spec
    {:name ::updatable-item-attributes
     :spec updatable-item-attributes-data}))
