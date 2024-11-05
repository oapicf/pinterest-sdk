(ns pinterest-rest-api.specs.update-invites-results-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.invite-business-role-binding :refer :all]
            )
  (:import (java.io File)))


(def update-invites-results-response-array-items-inner-data
  {
   (ds/opt :exception) invite-exception-response-spec
   (ds/opt :invite) invite-business-role-binding-spec
   })

(def update-invites-results-response-array-items-inner-spec
  (ds/spec
    {:name ::update-invites-results-response-array-items-inner
     :spec update-invites-results-response-array-items-inner-data}))
