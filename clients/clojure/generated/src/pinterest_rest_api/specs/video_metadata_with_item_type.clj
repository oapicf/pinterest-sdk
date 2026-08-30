(ns pinterest-rest-api.specs.video-metadata-with-item-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def video-metadata-with-item-type-data
  {
   (ds/opt :cover_image_url) string?
   (ds/opt :duration) float?
   (ds/opt :height) int?
   (ds/req :item_type) string?
   (ds/opt :video_url) string?
   (ds/opt :video_url_hls) string?
   (ds/opt :width) int?
   })

(def video-metadata-with-item-type-spec
  (ds/spec
    {:name ::video-metadata-with-item-type
     :spec video-metadata-with-item-type-data}))
