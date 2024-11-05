(ns pinterest-rest-api.specs.create-membership-or-partnership-invites-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-type :refer :all]
            )
  (:import (java.io File)))


(def create-membership-or-partnership-invites-body-data
  {
   (ds/req :business_role) string?
   (ds/req :invite_type) invite-type-spec
   (ds/opt :members) (s/coll-of string?)
   (ds/opt :partners) (s/coll-of string?)
   })

(def create-membership-or-partnership-invites-body-spec
  (ds/spec
    {:name ::create-membership-or-partnership-invites-body
     :spec create-membership-or-partnership-invites-body-data}))
