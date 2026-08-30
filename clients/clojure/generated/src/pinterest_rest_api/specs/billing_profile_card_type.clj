(ns pinterest-rest-api.specs.billing-profile-card-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-profile-card-type-data
  {
   })

(def billing-profile-card-type-spec
  (ds/spec
    {:name ::billing-profile-card-type
     :spec billing-profile-card-type-data}))
