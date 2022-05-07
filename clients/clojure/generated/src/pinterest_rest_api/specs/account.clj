(ns pinterest-rest-api.specs.account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def account-data
  {
   (ds/opt :account_type) string?
   (ds/opt :profile_image) string?
   (ds/opt :website_url) string?
   (ds/opt :username) string?
   })

(def account-spec
  (ds/spec
    {:name ::account
     :spec account-data}))
