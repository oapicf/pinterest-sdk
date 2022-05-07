(ns pinterest-rest-api.specs.board
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-owner :refer :all]
            )
  (:import (java.io File)))


(def board-data
  {
   (ds/opt :id) string?
   (ds/req :name) string?
   (ds/opt :description) string?
   (ds/opt :owner) board-owner-spec
   (ds/opt :privacy) string?
   })

(def board-spec
  (ds/spec
    {:name ::board
     :spec board-data}))
