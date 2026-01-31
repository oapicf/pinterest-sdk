(ns pinterest-rest-api.specs.account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def account-data
  {
   (ds/opt :about) string?
   (ds/opt :account_type) string?
   (ds/opt :board_count) int?
   (ds/opt :business_name) string?
   (ds/opt :follower_count) int?
   (ds/opt :following_count) int?
   (ds/opt :id) string?
   (ds/opt :monthly_views) int?
   (ds/opt :pin_count) int?
   (ds/opt :profile_image) string?
   (ds/opt :username) string?
   (ds/opt :website_url) string?
   })

(def account-spec
  (ds/spec
    {:name ::account
     :spec account-data}))
