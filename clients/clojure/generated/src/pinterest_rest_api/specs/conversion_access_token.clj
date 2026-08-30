(ns pinterest-rest-api.specs.conversion-access-token
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-access-token-data
  {
   (ds/req :access_token) string?
   (ds/opt :token_type) string?
   })

(def conversion-access-token-spec
  (ds/spec
    {:name ::conversion-access-token
     :spec conversion-access-token-data}))
