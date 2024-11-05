(ns pinterest-rest-api.specs.auth-respond-invites-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.auth-respond-invites-body-invites-inner :refer :all]
            )
  (:import (java.io File)))


(def auth-respond-invites-body-data
  {
   (ds/req :invites) (s/coll-of auth-respond-invites-body-invites-inner-spec)
   })

(def auth-respond-invites-body-spec
  (ds/spec
    {:name ::auth-respond-invites-body
     :spec auth-respond-invites-body-data}))
