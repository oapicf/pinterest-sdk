(ns pinterest-rest-api.specs.ad-account-create-subscription-request-partner-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-create-subscription-request-partner-metadata-data
  {
   (ds/opt :subscriber_key) string?
   })

(def ad-account-create-subscription-request-partner-metadata-spec
  (ds/spec
    {:name ::ad-account-create-subscription-request-partner-metadata
     :spec ad-account-create-subscription-request-partner-metadata-data}))
