(ns pinterest-rest-api.specs.ad-accounts-audience-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-type :refer :all]
            [pinterest-rest-api.specs.audience-update-operation-type :refer :all]
            [pinterest-rest-api.specs.ad-accounts-audience-rule :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-audience-update-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :audience_type) audience-type-spec
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :operation_type) audience-update-operation-type-spec
   (ds/opt :rule) ad-accounts-audience-rule-spec
   })

(def ad-accounts-audience-update-spec
  (ds/spec
    {:name ::ad-accounts-audience-update
     :spec ad-accounts-audience-update-data}))
