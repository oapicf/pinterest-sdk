(ns pinterest-rest-api.specs.pin-media-source-images-base64
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-source-images-base64-items-inner :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-images-base64-data
  {
   (ds/opt :source_type) string?
   (ds/req :items) (s/coll-of pin-media-source-images-base64-items-inner-spec)
   (ds/opt :index) int?
   })

(def pin-media-source-images-base64-spec
  (ds/spec
    {:name ::pin-media-source-images-base64
     :spec pin-media-source-images-base64-data}))
