(ns pinterest-rest-api.specs.pin-media-with-image-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-details :refer :all]
            )
  (:import (java.io File)))


(def pin-media-with-image-all-of-data
  {
   (ds/opt :images) (s/map-of string? image-details-spec)
   })

(def pin-media-with-image-all-of-spec
  (ds/spec
    {:name ::pin-media-with-image-all-of
     :spec pin-media-with-image-all-of-data}))
