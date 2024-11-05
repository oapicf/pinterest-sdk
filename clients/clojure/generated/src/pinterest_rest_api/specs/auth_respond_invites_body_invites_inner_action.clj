(ns pinterest-rest-api.specs.auth-respond-invites-body-invites-inner-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def auth-respond-invites-body-invites-inner-action-data
  {
   (ds/req :accept_invite) boolean?
   (ds/opt :asset_id_to_permissions) (s/map-of string? (s/coll-of permissions-spec))
   })

(def auth-respond-invites-body-invites-inner-action-spec
  (ds/spec
    {:name ::auth-respond-invites-body-invites-inner-action
     :spec auth-respond-invites-body-invites-inner-action-data}))
