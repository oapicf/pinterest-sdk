(ns pinterest-rest-api.specs.supplemental-item-batch-operation-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def supplemental-item-batch-operation-status-data
  {
   })

(def supplemental-item-batch-operation-status-spec
  (ds/spec
    {:name ::supplemental-item-batch-operation-status
     :spec supplemental-item-batch-operation-status-data}))
