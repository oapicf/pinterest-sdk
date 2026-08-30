(ns pinterest-rest-api.specs.ad-accounts-audience-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-type :refer :all]
            [pinterest-rest-api.specs.ad-accounts-audience-rule :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-audience-create-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :audience_type) audience-type-spec
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :rule) ad-accounts-audience-rule-spec
   })

(def ad-accounts-audience-create-spec
  (ds/spec
    {:name ::ad-accounts-audience-create
     :spec ad-accounts-audience-create-data}))
