(ns pinterest-rest-api.specs.ad-accounts-audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-type :refer :all]
            [pinterest-rest-api.specs.ad-accounts-audience-rule :refer :all]
            [pinterest-rest-api.specs.audience-status :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-audience-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :audience_type) audience-type-spec
   (ds/opt :created_by_company_name) string?
   (ds/opt :created_timestamp) int?
   (ds/opt :description) string?
   (ds/req :id) string?
   (ds/opt :is_nca) boolean?
   (ds/opt :name) string?
   (ds/opt :rule) ad-accounts-audience-rule-spec
   (ds/opt :size) int?
   (ds/opt :status) audience-status-spec
   (ds/opt :type) string?
   (ds/opt :updated_timestamp) int?
   })

(def ad-accounts-audience-spec
  (ds/spec
    {:name ::ad-accounts-audience
     :spec ad-accounts-audience-data}))
