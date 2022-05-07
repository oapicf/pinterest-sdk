(ns pinterest-rest-api.specs.catalogs-feed-validation-warnings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-validation-warnings-data
  {
   (ds/opt :title_length_too_long) int?
   (ds/opt :description_length_too_long) int?
   (ds/opt :gender_invalid) int?
   (ds/opt :age_group_invalid) int?
   (ds/opt :size_type_invalid) int?
   (ds/opt :link_format_warning) int?
   (ds/opt :duplicate_products) int?
   (ds/opt :duplicate_links) int?
   (ds/opt :sales_price_invalid) int?
   (ds/opt :product_category_depth_warning) int?
   (ds/opt :adwords_same_as_link) int?
   (ds/opt :duplicate_headers) int?
   (ds/opt :fetch_same_signature) int?
   (ds/opt :adwords_format_warning) int?
   (ds/opt :additional_image_link_warning) int?
   (ds/opt :image_link_warning) int?
   (ds/opt :shipping_invalid) int?
   (ds/opt :tax_invalid) int?
   (ds/opt :shipping_weight_invalid) int?
   (ds/opt :expiration_date_invalid) int?
   (ds/opt :availability_date_invalid) int?
   (ds/opt :sale_date_invalid) int?
   (ds/opt :weight_unit_invalid) int?
   (ds/opt :is_bundle_invalid) int?
   (ds/opt :updated_time_invalid) int?
   (ds/opt :custom_label_length_too_long) int?
   (ds/opt :product_type_length_too_long) int?
   (ds/opt :too_many_additional_image_links) int?
   (ds/opt :multipack_invalid) int?
   (ds/opt :indexed_product_count_large_delta) int?
   (ds/opt :item_additional_image_download_failure) int?
   (ds/opt :optional_product_category_missing) int?
   (ds/opt :optional_product_category_invalid) int?
   (ds/opt :optional_condition_missing) int?
   (ds/opt :optional_condition_invalid) int?
   (ds/opt :ios_deep_link_invalid) int?
   (ds/opt :android_deep_link_invalid) int?
   (ds/opt :availability_normalized) int?
   (ds/opt :condition_normalized) int?
   (ds/opt :gender_normalized) int?
   (ds/opt :size_type_normalized) int?
   (ds/opt :age_group_normalized) int?
   (ds/opt :utm_source_auto_corrected) int?
   (ds/opt :country_does_not_map_to_currency) int?
   (ds/opt :min_ad_price_invalid) int?
   })

(def catalogs-feed-validation-warnings-spec
  (ds/spec
    {:name ::catalogs-feed-validation-warnings
     :spec catalogs-feed-validation-warnings-data}))
