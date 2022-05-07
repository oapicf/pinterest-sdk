(ns pinterest-rest-api.specs.pin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-owner :refer :all]
            [pinterest-rest-api.specs.pin-media :refer :all]
            [pinterest-rest-api.specs.pin-media-source :refer :all]
            )
  (:import (java.io File)))


(def pin-data
  {
   (ds/opt :id) string?
   (ds/opt :created_at) inst?
   (ds/opt :link) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :alt_text) string?
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   (ds/opt :board_owner) board-owner-spec
   (ds/opt :media) pin-media-spec
   (ds/opt :media_source) pin-media-source-spec
   })

(def pin-spec
  (ds/spec
    {:name ::pin
     :spec pin-data}))
