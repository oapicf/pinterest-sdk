(ns pinterest-rest-api.specs.pin-media-source-image-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-image-url-data
  {
   (ds/req :source_type) string?
   (ds/req :url) string?
   (ds/opt :is_standard) boolean?
   })

(def pin-media-source-image-url-spec
  (ds/spec
    {:name ::pin-media-source-image-url
     :spec pin-media-source-image-url-data}))
