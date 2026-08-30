(ns pinterest-rest-api.specs.ad-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.creative-type :refer :all]
            [pinterest-rest-api.specs.customizable-cta-type :refer :all]
            [pinterest-rest-api.specs.disclosure-type :refer :all]
            [pinterest-rest-api.specs.grid-click-type :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def ad-update-request-data
  {
   (ds/req :id) string?
   (ds/opt :pin_id) string?
   (ds/opt :ad_group_id) string?
   (ds/opt :android_deep_link) string?
   (ds/opt :carousel_android_deep_links) (s/coll-of string?)
   (ds/opt :carousel_destination_urls) (s/coll-of string?)
   (ds/opt :carousel_ios_deep_links) (s/coll-of string?)
   (ds/opt :click_tracking_url) string?
   (ds/opt :creative_type) creative-type-spec
   (ds/opt :customizable_cta_type) customizable-cta-type-spec
   (ds/opt :destination_url) string?
   (ds/opt :disclosure_type) disclosure-type-spec
   (ds/opt :disclosure_url) string?
   (ds/opt :grid_click_type) grid-click-type-spec
   (ds/opt :ios_deep_link) string?
   (ds/opt :is_carting) boolean?
   (ds/opt :is_pin_deleted) boolean?
   (ds/opt :is_removable) boolean?
   (ds/opt :lead_form_id) string?
   (ds/opt :name) string?
   (ds/opt :quiz_pin_data) any?
   (ds/opt :status) entity-status-spec
   (ds/opt :tracking_urls) any?
   (ds/opt :view_tracking_url) string?
   })

(def ad-update-request-spec
  (ds/spec
    {:name ::ad-update-request
     :spec ad-update-request-data}))
