(ns pinterest-rest-api.specs.board-privacy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-privacy-data
  {
   })

(def board-privacy-spec
  (ds/spec
    {:name ::board-privacy
     :spec board-privacy-data}))
