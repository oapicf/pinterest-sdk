(ns pinterest-rest-api.specs.campaign-ad-preview-create-200-response-inner-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def campaign-ad-preview-create-200-response-inner-data-data
  {
   (ds/req :ad_account_id) string?
   (ds/req :ad_group_id) string?
   (ds/opt :client_id) int?
   (ds/req :expires_at) int?
   (ds/req :is_active) boolean?
   (ds/opt :pin_id) int?
   (ds/opt :pin_promotion_id) int?
   (ds/opt :promoted_product_group_id) int?
   (ds/req :url) string?
   (ds/req :user_id) int?
   (ds/req :uuid) string?
   (ds/req :exceptions) pinterest/lib/error-spec
   })

(def campaign-ad-preview-create-200-response-inner-data-spec
  (ds/spec
    {:name ::campaign-ad-preview-create-200-response-inner-data
     :spec campaign-ad-preview-create-200-response-inner-data-data}))
