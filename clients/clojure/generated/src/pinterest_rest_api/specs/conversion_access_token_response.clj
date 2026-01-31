(ns pinterest-rest-api.specs.conversion-access-token-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-access-token-response-data
  {
   (ds/req :access_token) string?
   (ds/opt :token_type) string?
   })

(def conversion-access-token-response-spec
  (ds/spec
    {:name ::conversion-access-token-response
     :spec conversion-access-token-response-data}))
