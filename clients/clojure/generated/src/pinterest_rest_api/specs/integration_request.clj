(ns pinterest-rest-api.specs.integration-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-request-data
  {
   (ds/opt :external_business_id) string?
   (ds/opt :connected_merchant_id) string?
   (ds/opt :connected_advertiser_id) string?
   (ds/opt :connected_lba_id) string?
   (ds/opt :connected_tag_id) string?
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_refresh_token) string?
   (ds/opt :partner_primary_email) string?
   (ds/opt :partner_access_token_expiry) int?
   (ds/opt :partner_refresh_token_expiry) int?
   (ds/opt :scopes) string?
   (ds/opt :additional_id_1) string?
   (ds/opt :partner_metadata) string?
   })

(def integration-request-spec
  (ds/spec
    {:name ::integration-request
     :spec integration-request-data}))
