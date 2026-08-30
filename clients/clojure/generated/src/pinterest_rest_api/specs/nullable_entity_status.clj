(ns pinterest-rest-api.specs.nullable-entity-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-entity-status-data
  {
   })

(def nullable-entity-status-spec
  (ds/spec
    {:name ::nullable-entity-status
     :spec nullable-entity-status-data}))
