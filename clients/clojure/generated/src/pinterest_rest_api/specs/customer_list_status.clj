(ns pinterest-rest-api.specs.customer-list-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-list-status-data
  {
   })

(def customer-list-status-spec
  (ds/spec
    {:name ::customer-list-status
     :spec customer-list-status-data}))
