(ns pinterest-rest-api.specs.ad-preview-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-shopping-preview-creative-type :refer :all]
            [pinterest-rest-api.specs.customizable-cta-type :refer :all]
            [pinterest-rest-api.specs.base-preferred-media-type :refer :all]
            )
  (:import (java.io File)))


(def ad-preview-request-data
  {
   (ds/req :image_url) string?
   (ds/opt :promotion_id) string?
   (ds/req :title) string?
   (ds/req :creative_type) ad-shopping-preview-creative-type-spec
   (ds/req :pin_id) string?
   (ds/req :catalog_product_group_id) string?
   (ds/opt :customizable_cta_type) customizable-cta-type-spec
   (ds/opt :hero_image_title) string?
   (ds/opt :hero_image_url) string?
   (ds/opt :hero_pin_id) string?
   (ds/opt :image_tag) string?
   (ds/opt :item_id) string?
   (ds/opt :preferred_media_type) base-preferred-media-type-spec
   (ds/opt :show_promotion) boolean?
   (ds/opt :video_tag) string?
   })

(def ad-preview-request-spec
  (ds/spec
    {:name ::ad-preview-request
     :spec ad-preview-request-data}))
