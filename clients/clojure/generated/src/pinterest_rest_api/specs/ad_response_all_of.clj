(ns pinterest-rest-api.specs.ad-response-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def ad-response-all-of-data
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
   })

(def ad-response-all-of-spec
  (ds/spec
    {:name ::ad-response-all-of
     :spec ad-response-all-of-data}))
