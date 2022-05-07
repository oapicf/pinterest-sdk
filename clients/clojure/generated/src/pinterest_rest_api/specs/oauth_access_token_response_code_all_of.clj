(ns pinterest-rest-api.specs.oauth-access-token-response-code-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-response-code-all-of-data
  {
   (ds/req :refresh_token) string?
   (ds/req :refresh_token_expires_in) int?
   })

(def oauth-access-token-response-code-all-of-spec
  (ds/spec
    {:name ::oauth-access-token-response-code-all-of
     :spec oauth-access-token-response-code-all-of-data}))
