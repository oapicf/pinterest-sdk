(ns pinterest-rest-api.specs.non-draft-entity-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def non-draft-entity-status-data
  {
   })

(def non-draft-entity-status-spec
  (ds/spec
    {:name ::non-draft-entity-status
     :spec non-draft-entity-status-data}))
