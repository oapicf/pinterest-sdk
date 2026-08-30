(ns pinterest-rest-api.specs.lead-subscription-post-params-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.partner-metadata :refer :all]
            )
  (:import (java.io File)))


(def lead-subscription-post-params-create-data
  {
   (ds/opt :lead_form_id) string?
   (ds/req :webhook_url) string?
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_metadata) partner-metadata-spec
   (ds/opt :partner_refresh_token) string?
   })

(def lead-subscription-post-params-create-spec
  (ds/spec
    {:name ::lead-subscription-post-params-create
     :spec lead-subscription-post-params-create-data}))
