(ns pinterest-rest-api.specs.pin-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.carousel-slot :refer :all]
            )
  (:import (java.io File)))


(def pin-update-data
  {
   (ds/opt :alt_text) string?
   (ds/opt :board_id) string?
   (ds/opt :board_section_id) string?
   (ds/opt :carousel_slots) (s/coll-of carousel-slot-spec)
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   })

(def pin-update-spec
  (ds/spec
    {:name ::pin-update
     :spec pin-update-data}))
