(ns pinterest-rest-api.specs.audience-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            [pinterest-rest-api.specs.audience-update-operation-type :refer :all]
            )
  (:import (java.io File)))


(def audience-update-request-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :name) string?
   (ds/opt :rule) audience-rule-spec
   (ds/opt :description) string?
   (ds/opt :operation_type) audience-update-operation-type-spec
   })

(def audience-update-request-spec
  (ds/spec
    {:name ::audience-update-request
     :spec audience-update-request-data}))
