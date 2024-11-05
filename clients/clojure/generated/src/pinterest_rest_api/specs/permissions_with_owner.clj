(ns pinterest-rest-api.specs.permissions-with-owner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def permissions-with-owner-data
  {
   })

(def permissions-with-owner-spec
  (ds/spec
    {:name ::permissions-with-owner
     :spec permissions-with-owner-data}))
