(ns pinterest-rest-api.specs.pin-media-with-video
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-size :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-video-data
  {
   (ds/opt :cover_image_url) string?
   (ds/opt :duration) float?
   (ds/opt :height) int?
   (ds/opt :images) image-size-spec
   (ds/req :media_type) string?
   (ds/opt :video_url) string?
   (ds/opt :video_url_hls) string?
   (ds/opt :width) int?
   })

(def pin-media-with-video-spec
  (ds/spec
    {:name ::pin-media-with-video
     :spec pin-media-with-video-data}))
