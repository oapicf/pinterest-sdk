(ns pinterest-rest-api.specs.pin-media-source-image-base64
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.content-type :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-image-base64-data
  {
   (ds/req :content_type) content-type-spec
   (ds/req :data) string?
   (ds/opt :is_standard) boolean?
   (ds/req :source_type) string?
   })

(def pin-media-source-image-base64-spec
  (ds/spec
    {:name ::pin-media-source-image-base64
     :spec pin-media-source-image-base64-data}))
