(ns pinterest-rest-api.specs.pin-media-source-images-url-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-images-url-items-inner-data
  {
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/req :url) string?
   })

(def pin-media-source-images-url-items-inner-spec
  (ds/spec
    {:name ::pin-media-source-images-url-items-inner
     :spec pin-media-source-images-url-items-inner-data}))
