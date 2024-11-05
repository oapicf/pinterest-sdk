(ns pinterest-rest-api.specs.board-owner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-owner-data
  {
   (ds/opt :username) string?
   })

(def board-owner-spec
  (ds/spec
    {:name ::board-owner
     :spec board-owner-data}))
