(ns pinterest-rest-api.specs.auth-respond-invite-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def auth-respond-invite-action-data
  {
   (ds/req :accept_invite) boolean?
   (ds/opt :asset_id_to_permissions) (s/map-of string? list?)
   })

(def auth-respond-invite-action-spec
  (ds/spec
    {:name ::auth-respond-invite-action
     :spec auth-respond-invite-action-data}))
