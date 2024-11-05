(ns pinterest-rest-api.specs.audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            )
  (:import (java.io File)))


(def audience-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :audience_type) string?
   (ds/opt :description) string?
   (ds/opt :rule) audience-rule-spec
   (ds/opt :size) int?
   (ds/opt :status) string?
   (ds/opt :type) string?
   (ds/opt :created_timestamp) int?
   (ds/opt :updated_timestamp) int?
   })

(def audience-spec
  (ds/spec
    {:name ::audience
     :spec audience-data}))
