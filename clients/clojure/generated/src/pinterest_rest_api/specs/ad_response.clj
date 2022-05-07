(ns pinterest-rest-api.specs.ad-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            [pinterest-rest-api.specs.pin-promotion-summary-status :refer :all]
            )
  (:import (java.io File)))


(def ad-response-data
  {
   (ds/opt :ad_group_id) string?
   (ds/opt :android_deep_link) string?
   (ds/opt :carousel_android_deep_links) (s/coll-of string?)
   (ds/opt :carousel_destination_urls) (s/coll-of string?)
   (ds/opt :carousel_ios_deep_links) (s/coll-of string?)
   (ds/opt :click_tracking_url) string?
   (ds/opt :creative_type) string?
   (ds/opt :destination_url) string?
   (ds/opt :ios_deep_link) string?
   (ds/opt :is_pin_deleted) boolean?
   (ds/opt :is_removable) boolean?
   (ds/opt :name) string?
   (ds/opt :pin_id) string?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_urls) tracking-urls-spec
   (ds/opt :view_tracking_url) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :campaign_id) string?
   (ds/opt :collection_items_destination_url_template) string?
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/opt :rejected_reasons) (s/coll-of string?)
   (ds/opt :rejection_labels) (s/coll-of string?)
   (ds/opt :review_status) string?
   (ds/opt :type) string?
   (ds/opt :updated_time) int?
   (ds/opt :summary_status) pin-promotion-summary-status-spec
   })

(def ad-response-spec
  (ds/spec
    {:name ::ad-response
     :spec ad-response-data}))
