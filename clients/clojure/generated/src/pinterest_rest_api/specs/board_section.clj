(ns pinterest-rest-api.specs.board-section
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-section-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   })

(def board-section-spec
  (ds/spec
    {:name ::board-section
     :spec board-section-data}))
