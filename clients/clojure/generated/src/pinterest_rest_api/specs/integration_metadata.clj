(ns pinterest-rest-api.specs.integration-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-metadata-data
  {
   (ds/opt :id) string?
   (ds/opt :external_business_id) string?
   (ds/opt :connected_merchant_id) string?
   (ds/opt :connected_user_id) string?
   (ds/opt :connected_advertiser_id) string?
   (ds/opt :connected_lba_id) string?
   (ds/opt :connected_tag_id) string?
   (ds/opt :partner_access_token_expiry) float?
   (ds/opt :partner_refresh_token_expiry) float?
   (ds/opt :scopes) string?
   (ds/opt :created_timestamp) float?
   (ds/opt :updated_timestamp) float?
   (ds/opt :additional_id_1) string?
   (ds/opt :partner_metadata) string?
   })

(def integration-metadata-spec
  (ds/spec
    {:name ::integration-metadata
     :spec integration-metadata-data}))
