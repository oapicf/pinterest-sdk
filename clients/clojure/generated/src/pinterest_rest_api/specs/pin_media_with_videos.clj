(ns pinterest-rest-api.specs.pin-media-with-videos
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.video-metadata :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-videos-data
  {
   (ds/opt :media_type) string?
   (ds/opt :items) (s/coll-of video-metadata-spec)
   })

(def pin-media-with-videos-spec
  (ds/spec
    {:name ::pin-media-with-videos
     :spec pin-media-with-videos-data}))
