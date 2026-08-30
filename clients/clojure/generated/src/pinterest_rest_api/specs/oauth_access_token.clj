(ns pinterest-rest-api.specs.oauth-access-token
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.token-grant-type :refer :all]
            )
  (:import (java.io File)))


(def oauth-access-token-data
  {
   (ds/req :access_token) string?
   (ds/req :expires_in) int?
   (ds/opt :refresh_token) string?
   (ds/opt :refresh_token_expires_at) int?
   (ds/opt :refresh_token_expires_in) int?
   (ds/opt :response_type) token-grant-type-spec
   (ds/opt :scope) string?
   (ds/req :token_type) string?
   })

(def oauth-access-token-spec
  (ds/spec
    {:name ::oauth-access-token
     :spec oauth-access-token-data}))
