(ns pinterest-rest-api.specs.lead-subscription
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-subscription-data
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

(def lead-subscription-spec
  (ds/spec
    {:name ::lead-subscription
     :spec lead-subscription-data}))
