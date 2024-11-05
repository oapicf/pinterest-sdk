(ns pinterest-rest-api.specs.ad-account-analytics-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-analytics-response-inner-data
  {
   (ds/req :AD_ACCOUNT_ID) string?
   (ds/opt :DATE) inst?
   })

(def ad-account-analytics-response-inner-spec
  (ds/spec
    {:name ::ad-account-analytics-response-inner
     :spec ad-account-analytics-response-inner-data}))
