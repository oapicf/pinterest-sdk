(ns pinterest-rest-api.specs.board-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-update-data
  {
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :privacy) string?
   })

(def board-update-spec
  (ds/spec
    {:name ::board-update
     :spec board-update-data}))
