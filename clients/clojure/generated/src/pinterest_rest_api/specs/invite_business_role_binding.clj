(ns pinterest-rest-api.specs.invite-business-role-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response-invite-data :refer :all]
            )
  (:import (java.io File)))


(def invite-business-role-binding-data
  {
   (ds/opt :created_by_business_id) string?
   (ds/opt :created_by_user_id) string?
   (ds/opt :user) business-access-user-summary-spec
   (ds/opt :id) string?
   (ds/opt :invite_data) base-invite-data-response-invite-data-spec
   (ds/opt :is_received_invite) boolean?
   })

(def invite-business-role-binding-spec
  (ds/spec
    {:name ::invite-business-role-binding
     :spec invite-business-role-binding-data}))
