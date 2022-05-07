(ns pinterest-rest-api.specs.oauth-access-token-request-refresh-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-refresh-all-of-data
  {
   (ds/req :refresh_token) string?
   (ds/opt :scope) string?
   })

(def oauth-access-token-request-refresh-all-of-spec
  (ds/spec
    {:name ::oauth-access-token-request-refresh-all-of
     :spec oauth-access-token-request-refresh-all-of-data}))
