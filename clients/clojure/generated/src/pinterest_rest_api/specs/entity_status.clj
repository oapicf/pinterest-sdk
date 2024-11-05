(ns pinterest-rest-api.specs.entity-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def entity-status-data
  {
   })

(def entity-status-spec
  (ds/spec
    {:name ::entity-status
     :spec entity-status-data}))
