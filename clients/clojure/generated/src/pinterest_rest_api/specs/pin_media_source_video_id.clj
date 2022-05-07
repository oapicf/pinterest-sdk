(ns pinterest-rest-api.specs.pin-media-source-video-id
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-video-id-data
  {
   (ds/req :source_type) string?
   (ds/req :cover_image_url) string?
   (ds/req :media_id) string?
   })

(def pin-media-source-video-id-spec
  (ds/spec
    {:name ::pin-media-source-video-id
     :spec pin-media-source-video-id-data}))
