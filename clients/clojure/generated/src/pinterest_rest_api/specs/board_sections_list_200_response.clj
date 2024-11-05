(ns pinterest-rest-api.specs.board-sections-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-section :refer :all]
            )
  (:import (java.io File)))


(def board-sections-list-200-response-data
  {
   (ds/req :items) (s/coll-of board-section-spec)
   (ds/opt :bookmark) string?
   })

(def board-sections-list-200-response-spec
  (ds/spec
    {:name ::board-sections-list-200-response
     :spec board-sections-list-200-response-data}))
