(ns pinterest-rest-api.specs.pin-media-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-metadata-images :refer :all]
            )
  (:import (java.io File)))


(def pin-media-metadata-data
  {
   (ds/opt :item_type) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :images) image-metadata-images-spec
   (ds/opt :cover_image_url) string?
   (ds/opt :video_url) string?
   (ds/opt :duration) float?
   (ds/opt :height) int?
   (ds/opt :width) int?
   })

(def pin-media-metadata-spec
  (ds/spec
    {:name ::pin-media-metadata
     :spec pin-media-metadata-data}))
