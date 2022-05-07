(ns pinterest-rest-api.specs.catalogs-feed-validation-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-validation-errors-data
  {
   (ds/opt :fetch_error) int?
   (ds/opt :fetch_inactive_feed_error) int?
   (ds/opt :encoding_error) int?
   (ds/opt :delimiter_error) int?
   (ds/opt :required_columns_missing) int?
   (ds/opt :image_link_invalid) int?
   (ds/opt :itemid_missing) int?
   (ds/opt :title_missing) int?
   (ds/opt :description_missing) int?
   (ds/opt :product_category_invalid) int?
   (ds/opt :product_link_missing) int?
   (ds/opt :image_link_missing) int?
   (ds/opt :availability_invalid) int?
   (ds/opt :product_price_invalid) int?
   (ds/opt :link_format_invalid) int?
   (ds/opt :parse_line_error) int?
   (ds/opt :adwords_format_invalid) int?
   (ds/opt :product_category_missing) int?
   (ds/opt :internal_service_error) int?
   (ds/opt :no_verified_domain) int?
   (ds/opt :adult_invalid) int?
   (ds/opt :invalid_domain) int?
   (ds/opt :feed_length_too_long) int?
   (ds/opt :link_length_too_long) int?
   (ds/opt :malformed_xml) int?
   (ds/opt :redirect_invalid) int?
   (ds/opt :price_missing) int?
   (ds/opt :feed_too_small) int?
   (ds/opt :condition_invalid) int?
   (ds/opt :shopify_no_products) int?
   (ds/opt :max_items_per_item_group_exceeded) int?
   (ds/opt :item_main_image_download_failure) int?
   (ds/opt :pinjoin_content_unsafe) int?
   (ds/opt :blocklisted_image_signature) int?
   })

(def catalogs-feed-validation-errors-spec
  (ds/spec
    {:name ::catalogs-feed-validation-errors
     :spec catalogs-feed-validation-errors-data}))
