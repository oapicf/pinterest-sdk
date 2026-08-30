(ns pinterest-rest-api.specs.pin-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ai-disclosures :refer :all]
            [pinterest-rest-api.specs.pin-media-source :refer :all]
            )
  (:import (java.io File)))


(def pin-create-data
  {
   (ds/opt :ai_disclosures) ai-disclosures-spec
   (ds/opt :alt_text) string?
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   (ds/opt :description) string?
   (ds/opt :dominant_color) string?
   (ds/opt :link) string?
   (ds/opt :media_source) pin-media-source-spec
   (ds/opt :parent_pin_id) string?
   (ds/opt :sponsor_id) string?
   (ds/opt :title) string?
   })

(def pin-create-spec
  (ds/spec
    {:name ::pin-create
     :spec pin-create-data}))
