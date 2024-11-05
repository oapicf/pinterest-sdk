(ns pinterest-rest-api.specs.pin-media-source-images-base64-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-images-base64-items-inner-data
  {
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/req :content_type) string?
   (ds/req :data) string?
   })

(def pin-media-source-images-base64-items-inner-spec
  (ds/spec
    {:name ::pin-media-source-images-base64-items-inner
     :spec pin-media-source-images-base64-items-inner-data}))
