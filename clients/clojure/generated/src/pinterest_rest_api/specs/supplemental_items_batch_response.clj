(ns pinterest-rest-api.specs.supplemental-items-batch-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.supplemental-operation-result :refer :all]
            [pinterest-rest-api.specs.supplemental-item-batch-operation-status :refer :all]
            )
  (:import (java.io File)))


(def supplemental-items-batch-response-data
  {
   (ds/req :batch_id) string?
   (ds/opt :completed_time) inst?
   (ds/req :created_time) inst?
   (ds/req :operation_results) (s/coll-of supplemental-operation-result-spec)
   (ds/req :status) supplemental-item-batch-operation-status-spec
   })

(def supplemental-items-batch-response-spec
  (ds/spec
    {:name ::supplemental-items-batch-response
     :spec supplemental-items-batch-response-data}))
