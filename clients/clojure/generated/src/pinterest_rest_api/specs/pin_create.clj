(ns pinterest-rest-api.specs.pin-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-owner :refer :all]
            [pinterest-rest-api.specs.pin-media :refer :all]
            [pinterest-rest-api.specs.pin-media-source :refer :all]
            )
  (:import (java.io File)))


(def pin-create-data
  {
   (ds/opt :id) string?
   (ds/opt :created_at) inst?
   (ds/opt :link) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :dominant_color) string?
   (ds/opt :alt_text) string?
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   (ds/opt :board_owner) board-owner-spec
   (ds/opt :media) pin-media-spec
   (ds/opt :media_source) pin-media-source-spec
   (ds/opt :parent_pin_id) string?
   (ds/opt :note) string?
   })

(def pin-create-spec
  (ds/spec
    {:name ::pin-create
     :spec pin-create-data}))
