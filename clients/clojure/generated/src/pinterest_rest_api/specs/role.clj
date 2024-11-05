(ns pinterest-rest-api.specs.role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def role-data
  {
   })

(def role-spec
  (ds/spec
    {:name ::role
     :spec role-data}))
