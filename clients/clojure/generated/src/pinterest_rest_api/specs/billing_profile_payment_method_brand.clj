(ns pinterest-rest-api.specs.billing-profile-payment-method-brand
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-profile-payment-method-brand-data
  {
   })

(def billing-profile-payment-method-brand-spec
  (ds/spec
    {:name ::billing-profile-payment-method-brand
     :spec billing-profile-payment-method-brand-data}))
