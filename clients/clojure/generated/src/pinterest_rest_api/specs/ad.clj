(ns pinterest-rest-api.specs.ad
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.carting-product :refer :all]
            [pinterest-rest-api.specs.ad-collections-header-type :refer :all]
            [pinterest-rest-api.specs.creative-type :refer :all]
            [pinterest-rest-api.specs.customizable-cta-type :refer :all]
            [pinterest-rest-api.specs.disclosure-type :refer :all]
            [pinterest-rest-api.specs.grid-click-type :refer :all]
            [pinterest-rest-api.specs.quiz-pin-data :refer :all]
            [pinterest-rest-api.specs.ad-disapproval-reasons :refer :all]
            [pinterest-rest-api.specs.ad-review-status :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.pin-promotion-summary-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def ad-data
  {
   (ds/req :ad_account_id) string?
   (ds/req :ad_group_id) string?
   (ds/opt :android_deep_link) string?
   (ds/req :campaign_id) string?
   (ds/opt :carousel_android_deep_links) (s/coll-of string?)
   (ds/opt :carousel_destination_urls) (s/coll-of string?)
   (ds/opt :carousel_ios_deep_links) (s/coll-of string?)
   (ds/opt :carting_platform_type) int?
   (ds/opt :carting_products) (s/coll-of carting-product-spec)
   (ds/opt :click_tracking_url) string?
   (ds/opt :collection_items_destination_url_template) string?
   (ds/opt :collections_header_type) ad-collections-header-type-spec
   (ds/opt :created_time) int?
   (ds/req :creative_type) creative-type-spec
   (ds/opt :customizable_cta_type) customizable-cta-type-spec
   (ds/opt :destination_url) string?
   (ds/opt :disclosure_type) disclosure-type-spec
   (ds/opt :disclosure_url) string?
   (ds/opt :grid_click_type) grid-click-type-spec
   (ds/req :id) string?
   (ds/opt :ios_deep_link) string?
   (ds/opt :is_carting) boolean?
   (ds/opt :is_collage_accepted_terms) boolean?
   (ds/opt :is_collage_single_destination) boolean?
   (ds/opt :is_pin_deleted) boolean?
   (ds/opt :is_removable) boolean?
   (ds/opt :lead_form_id) string?
   (ds/opt :name) string?
   (ds/req :pin_id) string?
   (ds/opt :quiz_pin_data) quiz-pin-data-spec
   (ds/req :rejected_reasons) (s/coll-of ad-disapproval-reasons-spec)
   (ds/req :rejection_labels) (s/coll-of string?)
   (ds/req :review_status) ad-review-status-spec
   (ds/opt :status) entity-status-spec
   (ds/req :summary_status) pin-promotion-summary-status-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/req :type) string?
   (ds/opt :updated_time) int?
   (ds/opt :view_tracking_url) string?
   })

(def ad-spec
  (ds/spec
    {:name ::ad
     :spec ad-data}))
