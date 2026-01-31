(ns pinterest-rest-api.specs.board-privacy-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def board-privacy-filter-data
  {
   })

(def board-privacy-filter-spec
  (ds/spec
    {:name ::board-privacy-filter
     :spec board-privacy-filter-data}))
