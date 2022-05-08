(ns pinterest-rest-api.specs.oauth-access-token-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oauth-access-token-request-data
  {
   (ds/req :grant_type) string?
   })

(def oauth-access-token-request-spec
  (ds/spec
    {:name ::oauth-access-token-request
     :spec oauth-access-token-request-data}))
