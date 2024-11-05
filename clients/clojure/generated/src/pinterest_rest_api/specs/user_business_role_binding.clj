(ns pinterest-rest-api.specs.user-business-role-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-member-assets-summary :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def user-business-role-binding-data
  {
   (ds/opt :assets_summary) business-member-assets-summary-spec
   (ds/opt :business_roles) (s/coll-of string?)
   (ds/opt :created_by_business) business-access-user-summary-spec
   (ds/opt :created_by_user) business-access-user-summary-spec
   (ds/opt :created_time) int?
   (ds/opt :id) string?
   (ds/opt :is_shared_partner) boolean?
   (ds/opt :user) business-access-user-summary-spec
   })

(def user-business-role-binding-spec
  (ds/spec
    {:name ::user-business-role-binding
     :spec user-business-role-binding-data}))
