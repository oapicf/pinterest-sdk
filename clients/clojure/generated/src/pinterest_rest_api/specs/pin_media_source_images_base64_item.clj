(ns pinterest-rest-api.specs.pin-media-source-images-base64-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.content-type :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-images-base64-item-data
  {
   (ds/req :content_type) content-type-spec
   (ds/req :data) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   })

(def pin-media-source-images-base64-item-spec
  (ds/spec
    {:name ::pin-media-source-images-base64-item
     :spec pin-media-source-images-base64-item-data}))
