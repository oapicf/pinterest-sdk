(ns pinterest-rest-api.specs.board-section-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-section-create-data
  {
   (ds/opt :id) string?
   (ds/req :name) string?
   })

(def board-section-create-spec
  (ds/spec
    {:name ::board-section-create
     :spec board-section-create-data}))
