(ns pinterest-rest-api.specs.ad-account-create-subscription-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-account-create-subscription-request-partner-metadata :refer :all]
            )
  (:import (java.io File)))


(def ad-account-create-subscription-request-data
  {
   (ds/req :webhook_url) string?
   (ds/opt :lead_form_id) string?
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_refresh_token) string?
   (ds/opt :partner_metadata) ad-account-create-subscription-request-partner-metadata-spec
   })

(def ad-account-create-subscription-request-spec
  (ds/spec
    {:name ::ad-account-create-subscription-request
     :spec ad-account-create-subscription-request-data}))
