(ns pinterest-rest-api.specs.ads-credit-redeem-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-redeem-request-data
  {
   (ds/req :offerCodeHash) string?
   (ds/req :validateOnly) boolean?
   })

(def ads-credit-redeem-request-spec
  (ds/spec
    {:name ::ads-credit-redeem-request
     :spec ads-credit-redeem-request-data}))
