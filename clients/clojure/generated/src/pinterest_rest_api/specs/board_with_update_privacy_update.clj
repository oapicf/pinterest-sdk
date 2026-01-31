(ns pinterest-rest-api.specs.board-with-update-privacy-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.board-update-privacy :refer :all]
            )
  (:import (java.io File)))


(def board-with-update-privacy-update-data
  {
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :privacy) board-update-privacy-spec
   })

(def board-with-update-privacy-update-spec
  (ds/spec
    {:name ::board-with-update-privacy-update
     :spec board-with-update-privacy-update-data}))
