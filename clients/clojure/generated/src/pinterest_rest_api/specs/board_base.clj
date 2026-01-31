(ns pinterest-rest-api.specs.board-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-media :refer :all]
            [pinterest-rest-api.specs.board-owner :refer :all]
            )
  (:import (java.io File)))


(def board-base-data
  {
   (ds/opt :board_pins_modified_at) inst?
   (ds/opt :collaborator_count) int?
   (ds/opt :created_at) inst?
   (ds/opt :description) string?
   (ds/opt :follower_count) int?
   (ds/req :id) string?
   (ds/opt :is_ads_only) boolean?
   (ds/opt :media) board-media-spec
   (ds/req :name) string?
   (ds/opt :owner) board-owner-spec
   (ds/opt :pin_count) int?
   })

(def board-base-spec
  (ds/spec
    {:name ::board-base
     :spec board-base-data}))
