(ns pinterest-rest-api.specs.board-update-privacy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-update-privacy-data
  {
   })

(def board-update-privacy-spec
  (ds/spec
    {:name ::board-update-privacy
     :spec board-update-privacy-data}))
