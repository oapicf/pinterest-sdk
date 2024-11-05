(ns pinterest-rest-api.specs.auth-respond-invites-body-invites-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.auth-respond-invites-body-invites-inner-action :refer :all]
            )
  (:import (java.io File)))


(def auth-respond-invites-body-invites-inner-data
  {
   (ds/req :action) auth-respond-invites-body-invites-inner-action-spec
   (ds/req :invite_id) string?
   })

(def auth-respond-invites-body-invites-inner-spec
  (ds/spec
    {:name ::auth-respond-invites-body-invites-inner
     :spec auth-respond-invites-body-invites-inner-data}))
