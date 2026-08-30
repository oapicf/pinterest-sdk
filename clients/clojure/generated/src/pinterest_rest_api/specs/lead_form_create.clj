(ns pinterest-rest-api.specs.lead-form-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form-policy-link :refer :all]
            [pinterest-rest-api.specs.lead-form-question :refer :all]
            [pinterest-rest-api.specs.lead-form-status :refer :all]
            )
  (:import (java.io File)))


(def lead-form-create-data
  {
   (ds/req :completion_message) string?
   (ds/opt :disclosure_language) string?
   (ds/req :has_accepted_terms) boolean?
   (ds/req :name) string?
   (ds/opt :policy_links) (s/coll-of lead-form-policy-link-spec)
   (ds/req :privacy_policy_link) string?
   (ds/req :questions) (s/coll-of lead-form-question-spec)
   (ds/opt :status) lead-form-status-spec
   })

(def lead-form-create-spec
  (ds/spec
    {:name ::lead-form-create
     :spec lead-form-create-data}))
