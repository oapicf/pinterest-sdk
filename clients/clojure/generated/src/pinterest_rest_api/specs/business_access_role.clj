(ns pinterest-rest-api.specs.business-access-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-access-role-data
  {
   })

(def business-access-role-spec
  (ds/spec
    {:name ::business-access-role
     :spec business-access-role-data}))
