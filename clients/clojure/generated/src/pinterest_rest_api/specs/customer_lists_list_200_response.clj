(ns pinterest-rest-api.specs.customer-lists-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.customer-list :refer :all]
            )
  (:import (java.io File)))


(def customer-lists-list-200-response-data
  {
   (ds/req :items) (s/coll-of customer-list-spec)
   (ds/opt :bookmark) string?
   })

(def customer-lists-list-200-response-spec
  (ds/spec
    {:name ::customer-lists-list-200-response
     :spec customer-lists-list-200-response-data}))
