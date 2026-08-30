(ns pinterest-rest-api.specs.ad-account-to-ad-account-shared-audience-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.operation-type :refer :all]
            )
  (:import (java.io File)))


(def ad-account-to-ad-account-shared-audience-update-with-required-body-data
  {
   (ds/req :audience_id) string?
   (ds/req :operation_type) operation-type-spec
   (ds/req :recipient_account_ids) (s/coll-of string?)
   })

(def ad-account-to-ad-account-shared-audience-update-with-required-body-spec
  (ds/spec
    {:name ::ad-account-to-ad-account-shared-audience-update-with-required-body
     :spec ad-account-to-ad-account-shared-audience-update-with-required-body-data}))
