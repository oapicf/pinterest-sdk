(ns pinterest-rest-api.specs.shared-audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.operation-type :refer :all]
            )
  (:import (java.io File)))


(def shared-audience-data
  {
   (ds/req :audience_id) string?
   (ds/req :operation_type) operation-type-spec
   (ds/req :recipient_account_ids) (s/coll-of string?)
   })

(def shared-audience-spec
  (ds/spec
    {:name ::shared-audience
     :spec shared-audience-data}))
