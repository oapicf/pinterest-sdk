(ns pinterest-rest-api.specs.board
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-media :refer :all]
            [pinterest-rest-api.specs.board-owner :refer :all]
            )
  (:import (java.io File)))


(def board-data
  {
   (ds/opt :id) string?
   (ds/opt :created_at) inst?
   (ds/opt :board_pins_modified_at) inst?
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/opt :collaborator_count) int?
   (ds/opt :pin_count) int?
   (ds/opt :follower_count) int?
   (ds/opt :media) board-media-spec
   (ds/opt :owner) board-owner-spec
   (ds/opt :privacy) string?
   })

(def board-spec
  (ds/spec
    {:name ::board
     :spec board-data}))
