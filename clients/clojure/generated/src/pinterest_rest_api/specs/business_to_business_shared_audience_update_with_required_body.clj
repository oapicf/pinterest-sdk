(ns pinterest-rest-api.specs.business-to-business-shared-audience-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.operation-type :refer :all]
            )
  (:import (java.io File)))


(def business-to-business-shared-audience-update-with-required-body-data
  {
   (ds/req :audience_id) string?
   (ds/req :operation_type) operation-type-spec
   (ds/req :recipient_business_ids) (s/coll-of string?)
   })

(def business-to-business-shared-audience-update-with-required-body-spec
  (ds/spec
    {:name ::business-to-business-shared-audience-update-with-required-body
     :spec business-to-business-shared-audience-update-with-required-body-data}))
