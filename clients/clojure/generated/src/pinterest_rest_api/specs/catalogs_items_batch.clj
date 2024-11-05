(ns pinterest-rest-api.specs.catalogs-items-batch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.batch-operation-status :refer :all]
            [pinterest-rest-api.specs.creative-assets-processing-record :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-batch-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :batch_id) string?
   (ds/opt :created_time) inst?
   (ds/opt :completed_time) inst?
   (ds/opt :status) batch-operation-status-spec
   (ds/opt :items) (s/coll-of creative-assets-processing-record-spec)
   })

(def catalogs-items-batch-spec
  (ds/spec
    {:name ::catalogs-items-batch
     :spec catalogs-items-batch-data}))
