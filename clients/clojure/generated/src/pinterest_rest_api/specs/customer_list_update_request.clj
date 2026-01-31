(ns pinterest-rest-api.specs.customer-list-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-list-operation-type :refer :all]
            )
  (:import (java.io File)))


(def customer-list-update-request-data
  {
   (ds/req :operation_type) user-list-operation-type-spec
   (ds/req :records) string?
   })

(def customer-list-update-request-spec
  (ds/spec
    {:name ::customer-list-update-request
     :spec customer-list-update-request-data}))
