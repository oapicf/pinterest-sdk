(ns pinterest-rest-api.specs.business-membership-member
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-role-for-members :refer :all]
            )
  (:import (java.io File)))


(def business-membership-member-data
  {
   (ds/req :business_role) business-role-for-members-spec
   (ds/req :member_id) string?
   })

(def business-membership-member-spec
  (ds/spec
    {:name ::business-membership-member
     :spec business-membership-member-data}))
