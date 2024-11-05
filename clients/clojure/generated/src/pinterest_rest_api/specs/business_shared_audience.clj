(ns pinterest-rest-api.specs.business-shared-audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.operation-type :refer :all]
            )
  (:import (java.io File)))


(def business-shared-audience-data
  {
   (ds/req :audience_id) string?
   (ds/req :operation_type) operation-type-spec
   (ds/req :recipient_business_ids) (s/coll-of string?)
   })

(def business-shared-audience-spec
  (ds/spec
    {:name ::business-shared-audience
     :spec business-shared-audience-data}))
