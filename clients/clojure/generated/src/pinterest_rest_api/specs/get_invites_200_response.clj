(ns pinterest-rest-api.specs.get-invites-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-response :refer :all]
            )
  (:import (java.io File)))


(def get-invites-200-response-data
  {
   (ds/req :items) (s/coll-of invite-response-spec)
   (ds/opt :bookmark) string?
   })

(def get-invites-200-response-spec
  (ds/spec
    {:name ::get-invites-200-response
     :spec get-invites-200-response-data}))
