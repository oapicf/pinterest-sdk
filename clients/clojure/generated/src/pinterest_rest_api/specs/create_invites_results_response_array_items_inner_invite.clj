(ns pinterest-rest-api.specs.create-invites-results-response-array-items-inner-invite
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def create-invites-results-response-array-items-inner-invite-data
  {
   (ds/opt :id) string?
   (ds/opt :user) business-access-user-summary-spec
   })

(def create-invites-results-response-array-items-inner-invite-spec
  (ds/spec
    {:name ::create-invites-results-response-array-items-inner-invite
     :spec create-invites-results-response-array-items-inner-invite-data}))
