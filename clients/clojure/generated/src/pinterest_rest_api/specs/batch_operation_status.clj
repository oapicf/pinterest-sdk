(ns pinterest-rest-api.specs.batch-operation-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-operation-status-data
  {
   })

(def batch-operation-status-spec
  (ds/spec
    {:name ::batch-operation-status
     :spec batch-operation-status-data}))
