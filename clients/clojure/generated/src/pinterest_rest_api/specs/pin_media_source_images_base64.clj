(ns pinterest-rest-api.specs.pin-media-source-images-base64
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-source-images-base64-item :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-images-base64-data
  {
   (ds/opt :index) int?
   (ds/req :items) (s/coll-of pin-media-source-images-base64-item-spec)
   (ds/req :source_type) string?
   })

(def pin-media-source-images-base64-spec
  (ds/spec
    {:name ::pin-media-source-images-base64
     :spec pin-media-source-images-base64-data}))
