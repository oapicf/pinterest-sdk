(ns pinterest-rest-api.specs.lead-form-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-status :refer :all]
            [pinterest-rest-api.specs.lead-form-question :refer :all]
            [pinterest-rest-api.specs.lead-form-common-policy-links-inner :refer :all]
            )
  (:import (java.io File)))


(def lead-form-response-data
  {
   (ds/opt :name) string?
   (ds/opt :privacy_policy_link) string?
   (ds/opt :has_accepted_terms) boolean?
   (ds/opt :completion_message) string?
   (ds/opt :status) lead-form-status-spec
   (ds/opt :disclosure_language) string?
   (ds/opt :questions) (s/coll-of lead-form-question-spec)
   (ds/opt :policy_links) (s/coll-of lead-form-common-policy-links-inner-spec)
   (ds/opt :id) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :created_time) int?
   (ds/opt :updated_time) int?
   })

(def lead-form-response-spec
  (ds/spec
    {:name ::lead-form-response
     :spec lead-form-response-data}))
