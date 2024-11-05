(ns pinterest-rest-api.specs.pin-media-with-image-all-of-images
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-image-all-of-images-data
  {
   (ds/opt :150x150) any?
   (ds/opt :400x300) any?
   (ds/opt :600x) any?
   (ds/opt :1200x) any?
   })

(def pin-media-with-image-all-of-images-spec
  (ds/spec
    {:name ::pin-media-with-image-all-of-images
     :spec pin-media-with-image-all-of-images-data}))
