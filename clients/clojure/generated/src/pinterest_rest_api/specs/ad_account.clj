(ns pinterest-rest-api.specs.ad-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.ad-account-owner :refer :all]
            [pinterest-rest-api.specs.business-access-role :refer :all]
            )
  (:import (java.io File)))


(def ad-account-data
  {
   (ds/opt :country) country-spec
   (ds/opt :created_time) int?
   (ds/opt :currency) currency-spec
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :owner) ad-account-owner-spec
   (ds/opt :permissions) (s/coll-of business-access-role-spec)
   (ds/opt :time_zone) string?
   (ds/opt :updated_time) int?
   })

(def ad-account-spec
  (ds/spec
    {:name ::ad-account
     :spec ad-account-data}))
