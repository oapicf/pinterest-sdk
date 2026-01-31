(ns pinterest-rest-api.specs.ad-accounts-subscriptions-get-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-subscription :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-subscriptions-get-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of lead-subscription-spec)
   })

(def ad-accounts-subscriptions-get-list-200-response-spec
  (ds/spec
    {:name ::ad-accounts-subscriptions-get-list-200-response
     :spec ad-accounts-subscriptions-get-list-200-response-data}))
