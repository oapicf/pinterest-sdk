(ns pinterest-rest-api.specs.pin-media-with-images
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-metadata :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-images-data
  {
   (ds/opt :items) (s/coll-of image-metadata-spec)
   (ds/req :media_type) string?
   })

(def pin-media-with-images-spec
  (ds/spec
    {:name ::pin-media-with-images
     :spec pin-media-with-images-data}))
