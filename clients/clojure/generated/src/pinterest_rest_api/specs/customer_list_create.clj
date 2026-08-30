(ns pinterest-rest-api.specs.customer-list-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-list-type :refer :all]
            [pinterest-rest-api.specs.customer-list-record-row :refer :all]
            )
  (:import (java.io File)))


(def customer-list-create-data
  {
   (ds/opt :is_nca) boolean?
   (ds/opt :list_type) user-list-type-spec
   (ds/req :name) string?
   (ds/opt :records) string?
   (ds/opt :records_v2) (s/coll-of customer-list-record-row-spec)
   })

(def customer-list-create-spec
  (ds/spec
    {:name ::customer-list-create
     :spec customer-list-create-data}))
