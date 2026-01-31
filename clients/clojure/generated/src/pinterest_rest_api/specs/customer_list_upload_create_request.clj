(ns pinterest-rest-api.specs.customer-list-upload-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-list-operation-type :refer :all]
            )
  (:import (java.io File)))


(def customer-list-upload-create-request-data
  {
   (ds/req :operation) user-list-operation-type-spec
   (ds/req :total_parts) int?
   })

(def customer-list-upload-create-request-spec
  (ds/spec
    {:name ::customer-list-upload-create-request
     :spec customer-list-upload-create-request-data}))
