(ns pinterest-rest-api.specs.catalogs-retail-items-batch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-processing-record :refer :all]
            [pinterest-rest-api.specs.batch-operation-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-items-batch-data
  {
   (ds/opt :batch_id) string?
   (ds/req :catalog_type) string?
   (ds/opt :completed_time) inst?
   (ds/req :created_time) inst?
   (ds/opt :items) (s/coll-of item-processing-record-spec)
   (ds/opt :status) batch-operation-status-spec
   })

(def catalogs-retail-items-batch-spec
  (ds/spec
    {:name ::catalogs-retail-items-batch
     :spec catalogs-retail-items-batch-data}))
