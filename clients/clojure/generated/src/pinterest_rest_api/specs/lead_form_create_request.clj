(ns pinterest-rest-api.specs.lead-form-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-common-policy-links-inner :refer :all]
            [pinterest-rest-api.specs.lead-form-question :refer :all]
            [pinterest-rest-api.specs.lead-form-status :refer :all]
            )
  (:import (java.io File)))


(def lead-form-create-request-data
  {
   (ds/opt :completion_message) string?
   (ds/opt :disclosure_language) string?
   (ds/opt :has_accepted_terms) boolean?
   (ds/opt :name) string?
   (ds/opt :policy_links) (s/coll-of lead-form-common-policy-links-inner-spec)
   (ds/opt :privacy_policy_link) string?
   (ds/opt :questions) (s/coll-of lead-form-question-spec)
   (ds/opt :status) lead-form-status-spec
   })

(def lead-form-create-request-spec
  (ds/spec
    {:name ::lead-form-create-request
     :spec lead-form-create-request-data}))
