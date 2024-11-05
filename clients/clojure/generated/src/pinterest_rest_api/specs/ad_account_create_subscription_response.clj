(ns pinterest-rest-api.specs.ad-account-create-subscription-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-create-subscription-response-data
  {
   (ds/opt :id) string?
   (ds/opt :cryptographic_key) string?
   (ds/opt :cryptographic_algorithm) string?
   (ds/opt :created_time) int?
   })

(def ad-account-create-subscription-response-spec
  (ds/spec
    {:name ::ad-account-create-subscription-response
     :spec ad-account-create-subscription-response-data}))
