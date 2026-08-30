(ns pinterest-rest-api.specs.entity-label-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def entity-label-status-data
  {
   })

(def entity-label-status-spec
  (ds/spec
    {:name ::entity-label-status
     :spec entity-label-status-data}))
