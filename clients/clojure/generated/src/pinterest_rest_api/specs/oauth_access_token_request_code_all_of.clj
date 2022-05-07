(ns pinterest-rest-api.specs.oauth-access-token-request-code-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-code-all-of-data
  {
   (ds/req :code) string?
   (ds/req :redirect_uri) string?
   })

(def oauth-access-token-request-code-all-of-spec
  (ds/spec
    {:name ::oauth-access-token-request-code-all-of
     :spec oauth-access-token-request-code-all-of-data}))
