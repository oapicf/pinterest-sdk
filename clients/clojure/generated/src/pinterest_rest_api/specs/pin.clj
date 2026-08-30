(ns pinterest-rest-api.specs.pin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ai-disclosures :refer :all]
            [pinterest-rest-api.specs.board-owner :refer :all]
            [pinterest-rest-api.specs.creative-type :refer :all]
            [pinterest-rest-api.specs.pin-media :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def pin-data
  {
   (ds/opt :ai_disclosures) ai-disclosures-spec
   (ds/opt :board_id) string?
   (ds/opt :board_owner) board-owner-spec
   (ds/opt :board_section_id) string?
   (ds/opt :created_at) inst?
   (ds/opt :creative_type) creative-type-spec
   (ds/opt :dominant_color) string?
   (ds/opt :has_been_promoted) boolean?
   (ds/req :id) string?
   (ds/opt :is_owner) boolean?
   (ds/opt :is_product) boolean?
   (ds/opt :is_standard) boolean?
   (ds/opt :media) pin-media-spec
   (ds/opt :parent_pin_id) string?
   (ds/opt :pin_metrics) any?
   (ds/opt :alt_text) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   })

(def pin-spec
  (ds/spec
    {:name ::pin
     :spec pin-data}))
