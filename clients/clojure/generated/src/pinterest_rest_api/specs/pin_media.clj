(ns pinterest-rest-api.specs.pin-media
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-data
  {
   (ds/opt :media_type) string?
   })

(def pin-media-spec
  (ds/spec
    {:name ::pin-media
     :spec pin-media-data}))
