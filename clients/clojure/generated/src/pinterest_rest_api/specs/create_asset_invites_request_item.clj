(ns pinterest-rest-api.specs.create-asset-invites-request-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-type :refer :all]
            )
  (:import (java.io File)))


(def create-asset-invites-request-item-data
  {
   (ds/req :invite_id) string?
   (ds/req :invite_type) invite-type-spec
   (ds/req :asset_id_to_permissions) (s/map-of string? (s/coll-of permissions-spec))
   })

(def create-asset-invites-request-item-spec
  (ds/spec
    {:name ::create-asset-invites-request-item
     :spec create-asset-invites-request-item-data}))
