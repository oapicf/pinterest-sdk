(ns pinterest-rest-api.specs.ad-account-analytics-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-analytics-items-data
  {
   (ds/req :AD_ACCOUNT_ID) string?
   (ds/opt :DATE) inst?
   })

(def ad-account-analytics-items-spec
  (ds/spec
    {:name ::ad-account-analytics-items
     :spec ad-account-analytics-items-data}))
