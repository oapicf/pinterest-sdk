(ns pinterest-rest-api.specs.audience-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            [pinterest-rest-api.specs.audience-create-request-1-audience-type :refer :all]
            )
  (:import (java.io File)))


(def audience-create-request-data
  {
   (ds/opt :ad_account_id) string?
   (ds/req :name) string?
   (ds/req :rule) audience-rule-spec
   (ds/opt :description) string?
   (ds/req :audience_type) audience-create-request-1-audience-type-spec
   })

(def audience-create-request-spec
  (ds/spec
    {:name ::audience-create-request
     :spec audience-create-request-data}))
