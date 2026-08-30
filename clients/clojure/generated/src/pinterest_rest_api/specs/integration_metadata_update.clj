(ns pinterest-rest-api.specs.integration-metadata-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-metadata-update-data
  {
   (ds/opt :additional_id_1) string?
   (ds/opt :connected_advertiser_id) string?
   (ds/opt :connected_lba_id) string?
   (ds/opt :connected_merchant_id) string?
   (ds/opt :connected_tag_id) string?
   (ds/opt :partner_access_token) string?
   (ds/opt :partner_access_token_expiry) float?
   (ds/opt :partner_metadata) string?
   (ds/opt :partner_primary_email) string?
   (ds/opt :partner_refresh_token) string?
   (ds/opt :partner_refresh_token_expiry) float?
   (ds/opt :scopes) string?
   })

(def integration-metadata-update-spec
  (ds/spec
    {:name ::integration-metadata-update
     :spec integration-metadata-update-data}))
