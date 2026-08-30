(ns pinterest-rest-api.specs.local-inventory-items-batch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.supplemental-operation-result :refer :all]
            [pinterest-rest-api.specs.supplemental-item-batch-operation-status :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-items-batch-data
  {
   (ds/req :batch_id) string?
   (ds/opt :completed_time) inst?
   (ds/req :created_time) inst?
   (ds/req :operation_results) (s/coll-of supplemental-operation-result-spec)
   (ds/req :status) supplemental-item-batch-operation-status-spec
   })

(def local-inventory-items-batch-spec
  (ds/spec
    {:name ::local-inventory-items-batch
     :spec local-inventory-items-batch-data}))
