(ns pinterest-rest-api.specs.board-with-update-privacy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-media :refer :all]
            [pinterest-rest-api.specs.board-owner :refer :all]
            [pinterest-rest-api.specs.board-update-privacy :refer :all]
            )
  (:import (java.io File)))


(def board-with-update-privacy-data
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
   (ds/opt :privacy) board-update-privacy-spec
   })

(def board-with-update-privacy-spec
  (ds/spec
    {:name ::board-with-update-privacy
     :spec board-with-update-privacy-data}))
