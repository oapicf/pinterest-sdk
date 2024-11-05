(ns pinterest-rest-api.specs.ads-credit-redeem-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-redeem-response-data
  {
   (ds/opt :success) boolean?
   (ds/opt :errorCode) int?
   (ds/opt :errorMessage) string?
   })

(def ads-credit-redeem-response-spec
  (ds/spec
    {:name ::ads-credit-redeem-response
     :spec ads-credit-redeem-response-data}))
