(ns pinterest-rest-api.specs.oauth-access-token-request-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-code-data
  {
   (ds/req :grant_type) string?
   (ds/req :code) string?
   (ds/req :redirect_uri) string?
   })

(def oauth-access-token-request-code-spec
  (ds/spec
    {:name ::oauth-access-token-request-code
     :spec oauth-access-token-request-code-data}))
