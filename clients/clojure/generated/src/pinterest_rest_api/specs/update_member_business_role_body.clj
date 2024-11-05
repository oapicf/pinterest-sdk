(ns pinterest-rest-api.specs.update-member-business-role-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-role-for-members :refer :all]
            )
  (:import (java.io File)))


(def update-member-business-role-body-data
  {
   (ds/req :business_role) business-role-for-members-spec
   (ds/req :member_id) string?
   })

(def update-member-business-role-body-spec
  (ds/spec
    {:name ::update-member-business-role-body
     :spec update-member-business-role-body-data}))
