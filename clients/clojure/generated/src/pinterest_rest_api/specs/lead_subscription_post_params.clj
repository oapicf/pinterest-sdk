(ns pinterest-rest-api.specs.lead-subscription-post-params
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.partner-metadata :refer :all]
            )
  (:import (java.io File)))


(def lead-subscription-post-params-data
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
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_metadata) partner-metadata-spec
   (ds/opt :partner_refresh_token) string?
   })

(def lead-subscription-post-params-spec
  (ds/spec
    {:name ::lead-subscription-post-params
     :spec lead-subscription-post-params-data}))
