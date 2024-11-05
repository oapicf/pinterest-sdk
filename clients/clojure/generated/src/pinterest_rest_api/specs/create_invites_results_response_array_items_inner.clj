(ns pinterest-rest-api.specs.create-invites-results-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.create-invites-results-response-array-items-inner-invite :refer :all]
            )
  (:import (java.io File)))


(def create-invites-results-response-array-items-inner-data
  {
   (ds/opt :exception) invite-exception-response-spec
   (ds/opt :invite) create-invites-results-response-array-items-inner-invite-spec
   })

(def create-invites-results-response-array-items-inner-spec
  (ds/spec
    {:name ::create-invites-results-response-array-items-inner
     :spec create-invites-results-response-array-items-inner-data}))
