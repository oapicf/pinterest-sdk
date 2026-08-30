(ns pinterest-rest-api.specs.cancel-invites-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cancel-invites-request-data
  {
   (ds/req :invite_ids) (s/coll-of string?)
   })

(def cancel-invites-request-spec
  (ds/spec
    {:name ::cancel-invites-request
     :spec cancel-invites-request-data}))
