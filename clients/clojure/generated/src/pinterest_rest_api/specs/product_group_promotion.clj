(ns pinterest-rest-api.specs.product-group-promotion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.creative-type :refer :all]
            [pinterest-rest-api.specs.grid-click-type :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-data
  {
   (ds/opt :ad_group_id) string?
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :catalog_product_group_id) string?
   (ds/opt :catalog_product_group_name) string?
   (ds/opt :collections_header_type) string?
   (ds/opt :collections_hero_destination_url) string?
   (ds/opt :collections_hero_pin_id) string?
   (ds/opt :creative_type) creative-type-spec
   (ds/opt :customizable_cta_type) string?
   (ds/opt :definition) string?
   (ds/opt :grid_click_type) grid-click-type-spec
   (ds/opt :id) string?
   (ds/opt :included) boolean?
   (ds/opt :is_generate_background) boolean?
   (ds/opt :is_mdl) boolean?
   (ds/opt :parent_id) string?
   (ds/opt :preferred_media_type) string?
   (ds/opt :relative_definition) string?
   (ds/opt :selected_image_tag) string?
   (ds/opt :selected_video_tag) string?
   (ds/opt :slideshow_collections_description) string?
   (ds/opt :slideshow_collections_title) string?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_url) string?
   })

(def product-group-promotion-spec
  (ds/spec
    {:name ::product-group-promotion
     :spec product-group-promotion-data}))
