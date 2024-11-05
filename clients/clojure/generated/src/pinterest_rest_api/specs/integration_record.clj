(ns pinterest-rest-api.specs.integration-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-record-data
  {
   (ds/opt :id) string?
   (ds/opt :external_business_id) string?
   (ds/opt :connected_merchant_id) string?
   (ds/opt :connected_user_id) string?
   (ds/opt :connected_advertiser_id) string?
   (ds/opt :connected_lba_id) string?
   (ds/opt :connected_tag_id) string?
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_refresh_token) string?
   (ds/opt :partner_primary_email) string?
   (ds/opt :partner_access_token_expiry) int?
   (ds/opt :partner_refresh_token_expiry) int?
   (ds/opt :scopes) string?
   (ds/opt :partner_metadata) string?
   (ds/opt :additional_id_1) string?
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   })

(def integration-record-spec
  (ds/spec
    {:name ::integration-record
     :spec integration-record-data}))
