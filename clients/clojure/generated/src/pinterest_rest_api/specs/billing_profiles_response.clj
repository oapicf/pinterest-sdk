(ns pinterest-rest-api.specs.billing-profiles-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.billing-type :refer :all]
            [pinterest-rest-api.specs.billing-profile-card-type :refer :all]
            [pinterest-rest-api.specs.billing-profile-payment-method-brand :refer :all]
            [pinterest-rest-api.specs.billing-profile-status :refer :all]
            )
  (:import (java.io File)))


(def billing-profiles-response-data
  {
   (ds/opt :advertiser_id) string?
   (ds/opt :billing_type) billing-type-spec
   (ds/opt :card_type) billing-profile-card-type-spec
   (ds/opt :id) string?
   (ds/opt :payment_method_brand) billing-profile-payment-method-brand-spec
   (ds/opt :status) billing-profile-status-spec
   })

(def billing-profiles-response-spec
  (ds/spec
    {:name ::billing-profiles-response
     :spec billing-profiles-response-data}))
