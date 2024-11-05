(ns pinterest-rest-api.specs.shared-audience-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shared-audience-account-data
  {
   (ds/req :account_id) string?
   (ds/req :account_name) string?
   (ds/req :account_type) string?
   (ds/req :shared_on_timestamp) int?
   })

(def shared-audience-account-spec
  (ds/spec
    {:name ::shared-audience-account
     :spec shared-audience-account-data}))
