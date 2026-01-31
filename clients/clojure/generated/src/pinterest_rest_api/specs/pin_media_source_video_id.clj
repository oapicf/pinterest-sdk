(ns pinterest-rest-api.specs.pin-media-source-video-id
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.content-type :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-video-id-data
  {
   (ds/opt :cover_image_content_type) content-type-spec
   (ds/opt :cover_image_data) string?
   (ds/opt :cover_image_key_frame_time) int?
   (ds/opt :cover_image_url) string?
   (ds/opt :is_standard) boolean?
   (ds/req :media_id) string?
   (ds/req :source_type) string?
   })

(def pin-media-source-video-id-spec
  (ds/spec
    {:name ::pin-media-source-video-id
     :spec pin-media-source-video-id-data}))
