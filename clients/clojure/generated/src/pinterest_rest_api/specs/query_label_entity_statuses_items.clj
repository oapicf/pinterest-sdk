(ns pinterest-rest-api.specs.query-label-entity-statuses-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def query-label-entity-statuses-items-data
  {
   })

(def query-label-entity-statuses-items-spec
  (ds/spec
    {:name ::query-label-entity-statuses-items
     :spec query-label-entity-statuses-items-data}))
