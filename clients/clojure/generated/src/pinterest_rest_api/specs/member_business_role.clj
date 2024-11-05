(ns pinterest-rest-api.specs.member-business-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def member-business-role-data
  {
   })

(def member-business-role-spec
  (ds/spec
    {:name ::member-business-role
     :spec member-business-role-data}))
