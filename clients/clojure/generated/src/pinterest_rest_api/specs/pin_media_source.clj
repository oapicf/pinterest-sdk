(ns pinterest-rest-api.specs.pin-media-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-data
  {
   (ds/req :source_type) string?
   (ds/req :content_type) string?
   (ds/req :data) string?
   (ds/req :url) string?
   (ds/req :cover_image_url) string?
   (ds/req :media_id) string?
   })

(def pin-media-source-spec
  (ds/spec
    {:name ::pin-media-source
     :spec pin-media-source-data}))
