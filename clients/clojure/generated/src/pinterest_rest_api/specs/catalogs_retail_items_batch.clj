(ns pinterest-rest-api.specs.catalogs-retail-items-batch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.batch-operation-status :refer :all]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.item-processing-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-items-batch-data
  {
   (ds/opt :batch_id) string?
   (ds/opt :created_time) inst?
   (ds/opt :completed_time) inst?
   (ds/opt :status) batch-operation-status-spec
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :items) (s/coll-of item-processing-record-spec)
   })

(def catalogs-retail-items-batch-spec
  (ds/spec
    {:name ::catalogs-retail-items-batch
     :spec catalogs-retail-items-batch-data}))
