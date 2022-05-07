(ns pinterest-rest-api.specs.oauth-access-token-request-refresh
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-refresh-data
  {
   (ds/req :grant_type) string?
   (ds/req :refresh_token) string?
   (ds/opt :scope) string?
   })

(def oauth-access-token-request-refresh-spec
  (ds/spec
    {:name ::oauth-access-token-request-refresh
     :spec oauth-access-token-request-refresh-data}))
