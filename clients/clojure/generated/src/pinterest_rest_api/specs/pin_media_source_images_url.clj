(ns pinterest-rest-api.specs.pin-media-source-images-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media-source-images-url-items-inner :refer :all]
            )
  (:import (java.io File)))


(def pin-media-source-images-url-data
  {
   (ds/opt :source_type) string?
   (ds/req :items) (s/coll-of pin-media-source-images-url-items-inner-spec)
   (ds/opt :index) int?
   })

(def pin-media-source-images-url-spec
  (ds/spec
    {:name ::pin-media-source-images-url
     :spec pin-media-source-images-url-data}))
