(ns pinterest-rest-api.specs.pin-media
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-size :refer :all]
            [pinterest-rest-api.specs.pin-media-metadata :refer :all]
            )
  (:import (java.io File)))


(def pin-media-data
  {
   (ds/opt :images) image-size-spec
   (ds/req :media_type) string?
   (ds/opt :cover_image_url) string?
   (ds/opt :duration) float?
   (ds/opt :height) int?
   (ds/opt :video_url) string?
   (ds/opt :video_url_hls) string?
   (ds/opt :width) int?
   (ds/opt :items) (s/coll-of pin-media-metadata-spec)
   })

(def pin-media-spec
  (ds/spec
    {:name ::pin-media
     :spec pin-media-data}))
