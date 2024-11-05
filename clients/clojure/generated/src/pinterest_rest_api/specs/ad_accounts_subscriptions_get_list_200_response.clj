(ns pinterest-rest-api.specs.ad-accounts-subscriptions-get-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-account-get-subscription-response :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-subscriptions-get-list-200-response-data
  {
   (ds/req :items) (s/coll-of ad-account-get-subscription-response-spec)
   (ds/opt :bookmark) string?
   })

(def ad-accounts-subscriptions-get-list-200-response-spec
  (ds/spec
    {:name ::ad-accounts-subscriptions-get-list-200-response
     :spec ad-accounts-subscriptions-get-list-200-response-data}))
