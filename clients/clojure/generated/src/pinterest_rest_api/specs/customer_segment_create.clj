(ns pinterest-rest-api.specs.customer-segment-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-segment-create-data
  {
   (ds/req :audience_ids) (s/coll-of string?)
   (ds/req :name) string?
   })

(def customer-segment-create-spec
  (ds/spec
    {:name ::customer-segment-create
     :spec customer-segment-create-data}))
