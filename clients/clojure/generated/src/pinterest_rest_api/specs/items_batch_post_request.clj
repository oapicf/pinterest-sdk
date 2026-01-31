(ns pinterest-rest-api.specs.items-batch-post-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.item-delete-batch-record :refer :all]
            [pinterest-rest-api.specs.batch-operation :refer :all]
            )
  (:import (java.io File)))


(def items-batch-post-request-data
  {
   (ds/opt :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/req :country) country-spec
   (ds/req :items) (s/coll-of item-delete-batch-record-spec)
   (ds/req :language) string?
   (ds/req :operation) batch-operation-spec
   })

(def items-batch-post-request-spec
  (ds/spec
    {:name ::items-batch-post-request
     :spec items-batch-post-request-data}))
