(ns pinterest-rest-api.specs.oauth-access-token-response-refresh
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-response-refresh-data
  {
   (ds/opt :response_type) string?
   (ds/req :access_token) string?
   (ds/req :token_type) string?
   (ds/req :expires_in) int?
   (ds/req :scope) string?
   })

(def oauth-access-token-response-refresh-spec
  (ds/spec
    {:name ::oauth-access-token-response-refresh
     :spec oauth-access-token-response-refresh-data}))
