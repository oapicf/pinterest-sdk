(ns pinterest-rest-api.specs.create-asset-invites-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.create-asset-invites-request-item :refer :all]
            )
  (:import (java.io File)))


(def create-asset-invites-request-data
  {
   (ds/req :invites) (s/coll-of create-asset-invites-request-item-spec)
   })

(def create-asset-invites-request-spec
  (ds/spec
    {:name ::create-asset-invites-request
     :spec create-asset-invites-request-data}))
