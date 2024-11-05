(ns pinterest-rest-api.specs.account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def account-data
  {
   (ds/opt :account_type) string?
   (ds/opt :id) string?
   (ds/opt :profile_image) string?
   (ds/opt :website_url) string?
   (ds/opt :username) string?
   (ds/opt :about) string?
   (ds/opt :business_name) string?
   (ds/opt :board_count) int?
   (ds/opt :pin_count) int?
   (ds/opt :follower_count) int?
   (ds/opt :following_count) int?
   (ds/opt :monthly_views) int?
   })

(def account-spec
  (ds/spec
    {:name ::account
     :spec account-data}))
