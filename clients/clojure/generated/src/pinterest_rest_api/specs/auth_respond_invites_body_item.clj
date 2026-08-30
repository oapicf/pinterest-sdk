(ns pinterest-rest-api.specs.auth-respond-invites-body-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.auth-respond-invite-action :refer :all]
            )
  (:import (java.io File)))


(def auth-respond-invites-body-item-data
  {
   (ds/req :action) auth-respond-invite-action-spec
   (ds/req :invite_id) string?
   })

(def auth-respond-invites-body-item-spec
  (ds/spec
    {:name ::auth-respond-invites-body-item
     :spec auth-respond-invites-body-item-data}))
