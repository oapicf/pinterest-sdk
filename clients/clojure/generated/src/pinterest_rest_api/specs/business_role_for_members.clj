(ns pinterest-rest-api.specs.business-role-for-members
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-role-for-members-data
  {
   })

(def business-role-for-members-spec
  (ds/spec
    {:name ::business-role-for-members
     :spec business-role-for-members-data}))
