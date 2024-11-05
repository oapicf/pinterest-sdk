(ns pinterest-rest-api.specs.pin-media-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-source-images-url-items-inner :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-data
  {
   (ds/req :source_type) string?
   (ds/req :content_type) string?
   (ds/req :data) string?
   (ds/opt :is_standard) boolean?
   (ds/req :url) string?
   (ds/opt :cover_image_url) string?
   (ds/opt :cover_image_content_type) string?
   (ds/opt :cover_image_data) string?
   (ds/req :media_id) string?
   (ds/req :items) (s/coll-of pin-media-source-images-url-items-inner-spec)
   (ds/opt :index) int?
   (ds/opt :is_affiliate_link) boolean?
   })

(def pin-media-source-spec
  (ds/spec
    {:name ::pin-media-source
     :spec pin-media-source-data}))
