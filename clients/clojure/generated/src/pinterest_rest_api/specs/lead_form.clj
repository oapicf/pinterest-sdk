(ns pinterest-rest-api.specs.lead-form
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-policy-link :refer :all]
            [pinterest-rest-api.specs.lead-form-question :refer :all]
            [pinterest-rest-api.specs.lead-form-status :refer :all]
            )
  (:import (java.io File)))


(def lead-form-data
  {
   (ds/opt :ad_account_id) string?
   (ds/req :completion_message) string?
   (ds/opt :created_time) int?
   (ds/opt :disclosure_language) string?
   (ds/req :has_accepted_terms) boolean?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/opt :policy_links) (s/coll-of lead-form-policy-link-spec)
   (ds/req :privacy_policy_link) string?
   (ds/req :questions) (s/coll-of lead-form-question-spec)
   (ds/opt :status) lead-form-status-spec
   (ds/opt :updated_time) int?
   })

(def lead-form-spec
  (ds/spec
    {:name ::lead-form
     :spec lead-form-data}))
