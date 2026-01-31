(ns pinterest-rest-api.specs.ad-account-create-subscription-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-create-subscription-response-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :api_version) string?
   (ds/opt :created_time) int?
   (ds/opt :cryptographic_algorithm) string?
   (ds/opt :cryptographic_key) string?
   (ds/opt :id) string?
   (ds/opt :lead_form_id) string?
   (ds/opt :user_account_id) string?
   (ds/opt :webhook_url) string?
   })

(def ad-account-create-subscription-response-spec
  (ds/spec
    {:name ::ad-account-create-subscription-response
     :spec ad-account-create-subscription-response-data}))
