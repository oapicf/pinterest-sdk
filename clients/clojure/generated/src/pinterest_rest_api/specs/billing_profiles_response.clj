(ns pinterest-rest-api.specs.billing-profiles-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-profiles-response-data
  {
   (ds/opt :advertiser_id) string?
   (ds/opt :billing_type) string?
   (ds/opt :card_type) string?
   (ds/opt :id) string?
   (ds/opt :payment_method_brand) string?
   (ds/opt :status) string?
   })

(def billing-profiles-response-spec
  (ds/spec
    {:name ::billing-profiles-response
     :spec billing-profiles-response-data}))
