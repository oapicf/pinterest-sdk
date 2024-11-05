(ns pinterest-rest-api.specs.oauth-access-token-response-integration-refresh
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-response-integration-refresh-data
  {
   (ds/opt :response_type) string?
   (ds/req :access_token) string?
   (ds/req :token_type) string?
   (ds/req :expires_in) int?
   (ds/req :scope) string?
   (ds/req :refresh_token) string?
   (ds/req :refresh_token_expires_in) int?
   })

(def oauth-access-token-response-integration-refresh-spec
  (ds/spec
    {:name ::oauth-access-token-response-integration-refresh
     :spec oauth-access-token-response-integration-refresh-data}))
