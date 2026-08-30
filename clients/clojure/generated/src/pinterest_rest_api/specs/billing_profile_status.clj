(ns pinterest-rest-api.specs.billing-profile-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-profile-status-data
  {
   })

(def billing-profile-status-spec
  (ds/spec
    {:name ::billing-profile-status
     :spec billing-profile-status-data}))
