(ns pinterest-rest-api.specs.ad-account-get-subscription-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-get-subscription-response-data
  {
   (ds/opt :lead_form_id) string?
   (ds/opt :webhook_url) string?
   (ds/opt :id) string?
   (ds/opt :user_account_id) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :api_version) string?
   (ds/opt :cryptographic_key) string?
   (ds/opt :cryptographic_algorithm) string?
   (ds/opt :created_time) int?
   })

(def ad-account-get-subscription-response-spec
  (ds/spec
    {:name ::ad-account-get-subscription-response
     :spec ad-account-get-subscription-response-data}))
