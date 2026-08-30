(ns pinterest-rest-api.specs.board-section-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-section-update-with-required-body-data
  {
   (ds/opt :id) string?
   (ds/req :name) string?
   })

(def board-section-update-with-required-body-spec
  (ds/spec
    {:name ::board-section-update-with-required-body
     :spec board-section-update-with-required-body-data}))
