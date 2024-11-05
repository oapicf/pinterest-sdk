(ns pinterest-rest-api.specs.permissions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def permissions-data
  {
   })

(def permissions-spec
  (ds/spec
    {:name ::permissions
     :spec permissions-data}))
