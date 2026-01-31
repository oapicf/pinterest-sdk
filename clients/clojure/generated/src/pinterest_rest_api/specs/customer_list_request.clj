(ns pinterest-rest-api.specs.customer-list-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.user-list-type :refer :all]
            )
  (:import (java.io File)))


(def customer-list-request-data
  {
   (ds/opt :list_type) user-list-type-spec
   (ds/req :name) string?
   (ds/req :records) string?
   })

(def customer-list-request-spec
  (ds/spec
    {:name ::customer-list-request
     :spec customer-list-request-data}))
