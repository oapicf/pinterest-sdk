(ns pinterest-rest-api.specs.respond-to-invites-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.respond-to-invite-result-item :refer :all]
            )
  (:import (java.io File)))


(def respond-to-invites-response-array-data
  {
   (ds/opt :items) (s/coll-of respond-to-invite-result-item-spec)
   })

(def respond-to-invites-response-array-spec
  (ds/spec
    {:name ::respond-to-invites-response-array
     :spec respond-to-invites-response-array-data}))
