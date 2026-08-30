(ns pinterest-rest-api.specs.business-role-for-invite
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-role-for-invite-data
  {
   })

(def business-role-for-invite-spec
  (ds/spec
    {:name ::business-role-for-invite
     :spec business-role-for-invite-data}))
