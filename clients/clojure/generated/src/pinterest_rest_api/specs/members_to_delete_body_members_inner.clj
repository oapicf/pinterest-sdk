(ns pinterest-rest-api.specs.members-to-delete-body-members-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-role-for-members :refer :all]
            )
  (:import (java.io File)))


(def members-to-delete-body-members-inner-data
  {
   (ds/req :member_id) string?
   (ds/req :business_role) business-role-for-members-spec
   })

(def members-to-delete-body-members-inner-spec
  (ds/spec
    {:name ::members-to-delete-body-members-inner
     :spec members-to-delete-body-members-inner-data}))
