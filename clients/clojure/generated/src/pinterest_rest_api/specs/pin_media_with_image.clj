(ns pinterest-rest-api.specs.pin-media-with-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-size :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-image-data
  {
   (ds/opt :images) image-size-spec
   (ds/req :media_type) string?
   })

(def pin-media-with-image-spec
  (ds/spec
    {:name ::pin-media-with-image
     :spec pin-media-with-image-data}))
