(ns pinterest-rest-api.specs.cancel-invites-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cancel-invites-body-data
  {
   (ds/req :invite_ids) (s/coll-of string?)
   })

(def cancel-invites-body-spec
  (ds/spec
    {:name ::cancel-invites-body
     :spec cancel-invites-body-data}))
