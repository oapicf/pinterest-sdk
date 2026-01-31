(ns pinterest-rest-api.specs.pin-media-source-images-url-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-images-url-item-data
  {
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   (ds/req :url) string?
   })

(def pin-media-source-images-url-item-spec
  (ds/spec
    {:name ::pin-media-source-images-url-item
     :spec pin-media-source-images-url-item-data}))
