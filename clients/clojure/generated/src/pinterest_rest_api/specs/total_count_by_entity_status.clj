(ns pinterest-rest-api.specs.total-count-by-entity-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def total-count-by-entity-status-data
  {
   (ds/opt :ACTIVE) int?
   (ds/opt :ARCHIVED) int?
   (ds/opt :PAUSED) int?
   })

(def total-count-by-entity-status-spec
  (ds/spec
    {:name ::total-count-by-entity-status
     :spec total-count-by-entity-status-data}))
