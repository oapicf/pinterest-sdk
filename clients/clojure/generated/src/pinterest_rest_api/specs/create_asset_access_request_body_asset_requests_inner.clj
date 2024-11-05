(ns pinterest-rest-api.specs.create-asset-access-request-body-asset-requests-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-asset-access-request-body-asset-requests-inner-data
  {
   (ds/req :partner_id) string?
   (ds/req :asset_id_to_permissions) (s/map-of string? (s/coll-of permissions-spec))
   })

(def create-asset-access-request-body-asset-requests-inner-spec
  (ds/spec
    {:name ::create-asset-access-request-body-asset-requests-inner
     :spec create-asset-access-request-body-asset-requests-inner-data}))
