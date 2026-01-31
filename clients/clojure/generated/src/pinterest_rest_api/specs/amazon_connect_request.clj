(ns pinterest-rest-api.specs.amazon-connect-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def amazon-connect-request-data
  {
   (ds/opt :amazon_storefront_id) string?
   (ds/req :amazon_storefront_name) string?
   (ds/req :amazon_storefront_url) string?
   (ds/opt :amazon_user_id) string?
   (ds/req :is_amazon_account_linked) boolean?
   (ds/opt :one_time_passcode) string?
   (ds/opt :pinterest_user_id) string?
   })

(def amazon-connect-request-spec
  (ds/spec
    {:name ::amazon-connect-request
     :spec amazon-connect-request-data}))
