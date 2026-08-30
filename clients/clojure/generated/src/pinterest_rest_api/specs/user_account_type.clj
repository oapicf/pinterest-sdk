(ns pinterest-rest-api.specs.user-account-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-account-type-data
  {
   })

(def user-account-type-spec
  (ds/spec
    {:name ::user-account-type
     :spec user-account-type-data}))
