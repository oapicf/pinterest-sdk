(ns pinterest-rest-api.specs.pin-media-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.content-type :refer :all]
            [pinterest-rest-api.specs.content-type :refer :all]
            [pinterest-rest-api.specs.pin-media-source-images-url-item :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-data
  {
   (ds/req :content_type) content-type-spec
   (ds/req :data) string?
   (ds/opt :is_standard) boolean?
   (ds/req :source_type) string?
   (ds/req :url) string?
   (ds/opt :cover_image_content_type) content-type-spec
   (ds/opt :cover_image_data) string?
   (ds/opt :cover_image_key_frame_time) int?
   (ds/opt :cover_image_url) string?
   (ds/req :media_id) string?
   (ds/opt :index) int?
   (ds/req :items) (s/coll-of pin-media-source-images-url-item-spec)
   (ds/opt :is_affiliate_link) boolean?
   })

(def pin-media-source-spec
  (ds/spec
    {:name ::pin-media-source
     :spec pin-media-source-data}))
