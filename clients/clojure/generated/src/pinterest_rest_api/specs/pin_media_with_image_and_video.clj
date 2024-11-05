(ns pinterest-rest-api.specs.pin-media-with-image-and-video
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-metadata :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-image-and-video-data
  {
   (ds/opt :media_type) string?
   (ds/opt :items) (s/coll-of pin-media-metadata-spec)
   })

(def pin-media-with-image-and-video-spec
  (ds/spec
    {:name ::pin-media-with-image-and-video
     :spec pin-media-with-image-and-video-data}))
