(ns pinterest-rest-api.specs.ads-credit-redeem-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-redeem-create-data
  {
   (ds/req :offerCodeHash) string?
   (ds/req :validateOnly) boolean?
   })

(def ads-credit-redeem-create-spec
  (ds/spec
    {:name ::ads-credit-redeem-create
     :spec ads-credit-redeem-create-data}))
