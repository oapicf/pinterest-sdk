(ns pinterest-rest-api.specs.ads-credit-redeem
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-redeem-data
  {
   (ds/opt :errorCode) int?
   (ds/opt :errorMessage) string?
   (ds/opt :success) boolean?
   })

(def ads-credit-redeem-spec
  (ds/spec
    {:name ::ads-credit-redeem
     :spec ads-credit-redeem-data}))
