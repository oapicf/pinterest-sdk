(ns pinterest-rest-api.specs.invite-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.base-invite-data-response-invite-data :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def invite-response-data
  {
   (ds/opt :id) string?
   (ds/opt :invite_data) base-invite-data-response-invite-data-spec
   (ds/opt :is_received_invite) boolean?
   (ds/opt :user) business-access-user-summary-spec
   (ds/opt :assets_summary) invite-assets-summary-spec
   (ds/opt :business_roles) (s/coll-of string?)
   (ds/opt :created_by_business) any?
   (ds/opt :created_by_user) any?
   (ds/opt :created_time) int?
   })

(def invite-response-spec
  (ds/spec
    {:name ::invite-response
     :spec invite-response-data}))
