(ns pinterest-rest-api.specs.audience-create-custom-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            [pinterest-rest-api.specs.audience-sharing-type :refer :all]
            [pinterest-rest-api.specs.audience-data-party :refer :all]
            )
  (:import (java.io File)))


(def audience-create-custom-request-data
  {
   (ds/opt :ad_account_id) string?
   (ds/req :name) string?
   (ds/req :rule) audience-rule-spec
   (ds/req :sharing_type) audience-sharing-type-spec
   (ds/req :data_party) audience-data-party-spec
   (ds/opt :category) string?
   })

(def audience-create-custom-request-spec
  (ds/spec
    {:name ::audience-create-custom-request
     :spec audience-create-custom-request-data}))
