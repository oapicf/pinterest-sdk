(ns pinterest-rest-api.specs.business-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-role-data
  {
   })

(def business-role-spec
  (ds/spec
    {:name ::business-role
     :spec business-role-data}))
