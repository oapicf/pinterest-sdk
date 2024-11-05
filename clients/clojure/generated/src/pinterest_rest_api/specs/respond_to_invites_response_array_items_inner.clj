(ns pinterest-rest-api.specs.respond-to-invites-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-exception-response :refer :all]
            [pinterest-rest-api.specs.base-invite-data-response :refer :all]
            )
  (:import (java.io File)))


(def respond-to-invites-response-array-items-inner-data
  {
   (ds/opt :exception) invite-exception-response-spec
   (ds/opt :invite) base-invite-data-response-spec
   })

(def respond-to-invites-response-array-items-inner-spec
  (ds/spec
    {:name ::respond-to-invites-response-array-items-inner
     :spec respond-to-invites-response-array-items-inner-data}))
