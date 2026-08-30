(ns pinterest-rest-api.specs.ad-account-to-business-shared-audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.role :refer :all]
            )
  (:import (java.io File)))


(def ad-account-to-business-shared-audience-data
  {
   (ds/req :audience_id) string?
   (ds/opt :permissions) (s/coll-of role-spec)
   (ds/req :recipient_business_ids) (s/coll-of string?)
   })

(def ad-account-to-business-shared-audience-spec
  (ds/spec
    {:name ::ad-account-to-business-shared-audience
     :spec ad-account-to-business-shared-audience-data}))
