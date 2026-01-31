(ns pinterest-rest-api.specs.oauth-access-token-request-client-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-client-credentials-data
  {
   (ds/req :scope) string?
   (ds/req :grant_type) string?
   })

(def oauth-access-token-request-client-credentials-spec
  (ds/spec
    {:name ::oauth-access-token-request-client-credentials
     :spec oauth-access-token-request-client-credentials-data}))
