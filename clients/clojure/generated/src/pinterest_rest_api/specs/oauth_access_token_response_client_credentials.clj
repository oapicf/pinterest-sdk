(ns pinterest-rest-api.specs.oauth-access-token-response-client-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-response-client-credentials-data
  {
   (ds/req :access_token) string?
   (ds/req :expires_in) int?
   (ds/opt :response_type) string?
   (ds/req :scope) string?
   (ds/req :token_type) string?
   })

(def oauth-access-token-response-client-credentials-spec
  (ds/spec
    {:name ::oauth-access-token-response-client-credentials
     :spec oauth-access-token-response-client-credentials-data}))
