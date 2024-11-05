(ns pinterest-rest-api.specs.ads-credit-discounts-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-discounts-response-data
  {
   (ds/opt :active) boolean?
   (ds/opt :advertiser_id) string?
   (ds/opt :discountType) string?
   (ds/opt :discountInMicroCurrency) float?
   (ds/opt :discountCurrency) string?
   (ds/opt :title) string?
   (ds/opt :remainingDiscountInMicroCurrency) float?
   })

(def ads-credit-discounts-response-spec
  (ds/spec
    {:name ::ads-credit-discounts-response
     :spec ads-credit-discounts-response-data}))
