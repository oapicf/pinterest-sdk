(ns pinterest-rest-api.specs.shared-audience-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-account-type :refer :all]
            )
  (:import (java.io File)))


(def shared-audience-account-data
  {
   (ds/req :account_id) string?
   (ds/req :account_name) string?
   (ds/req :account_type) audience-account-type-spec
   (ds/req :shared_on_timestamp) int?
   })

(def shared-audience-account-spec
  (ds/spec
    {:name ::shared-audience-account
     :spec shared-audience-account-data}))
