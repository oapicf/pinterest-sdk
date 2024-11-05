(ns pinterest-rest-api.specs.board-media
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-media-data
  {
   (ds/opt :image_cover_url) string?
   (ds/opt :pin_thumbnail_urls) (s/coll-of string?)
   })

(def board-media-spec
  (ds/spec
    {:name ::board-media
     :spec board-media-data}))
