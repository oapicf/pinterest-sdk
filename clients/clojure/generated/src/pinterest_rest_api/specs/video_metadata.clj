(ns pinterest-rest-api.specs.video-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def video-metadata-data
  {
   (ds/opt :item_type) string?
   (ds/opt :cover_image_url) string?
   (ds/opt :video_url) string?
   (ds/opt :duration) float?
   (ds/opt :height) int?
   (ds/opt :width) int?
   })

(def video-metadata-spec
  (ds/spec
    {:name ::video-metadata
     :spec video-metadata-data}))
