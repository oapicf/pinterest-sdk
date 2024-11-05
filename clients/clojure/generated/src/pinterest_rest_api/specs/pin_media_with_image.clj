(ns pinterest-rest-api.specs.pin-media-with-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-with-image-all-of-images :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-image-data
  {
   (ds/opt :media_type) string?
   (ds/opt :images) pin-media-with-image-all-of-images-spec
   })

(def pin-media-with-image-spec
  (ds/spec
    {:name ::pin-media-with-image
     :spec pin-media-with-image-data}))
