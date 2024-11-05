(ns pinterest-rest-api.specs.pin-media-source-image-base64
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-image-base64-data
  {
   (ds/req :source_type) string?
   (ds/req :content_type) string?
   (ds/req :data) string?
   (ds/opt :is_standard) boolean?
   })

(def pin-media-source-image-base64-spec
  (ds/spec
    {:name ::pin-media-source-image-base64
     :spec pin-media-source-image-base64-data}))
