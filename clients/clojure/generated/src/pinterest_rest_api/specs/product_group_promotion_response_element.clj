(ns pinterest-rest-api.specs.product-group-promotion-response-element
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.grid-click-type :refer :all]
            [pinterest-rest-api.specs.creative-type :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-response-element-data
  {
   (ds/opt :id) string?
   (ds/opt :ad_group_id) string?
   (ds/opt :bid_in_micro_currency) int?
   (ds/opt :included) boolean?
   (ds/opt :definition) string?
   (ds/opt :relative_definition) string?
   (ds/opt :parent_id) string?
   (ds/opt :slideshow_collections_title) string?
   (ds/opt :slideshow_collections_description) string?
   (ds/opt :is_mdl) boolean?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_url) string?
   (ds/opt :catalog_product_group_id) string?
   (ds/opt :catalog_product_group_name) string?
   (ds/opt :collections_hero_pin_id) string?
   (ds/opt :collections_hero_destination_url) string?
   (ds/opt :grid_click_type) grid-click-type-spec
   (ds/opt :creative_type) creative-type-spec
   })

(def product-group-promotion-response-element-spec
  (ds/spec
    {:name ::product-group-promotion-response-element
     :spec product-group-promotion-response-element-data}))
