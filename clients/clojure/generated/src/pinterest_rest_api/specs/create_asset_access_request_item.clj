(ns pinterest-rest-api.specs.create-asset-access-request-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-asset-access-request-item-data
  {
   (ds/req :asset_id_to_permissions) (s/map-of string? list?)
   (ds/req :partner_id) string?
   })

(def create-asset-access-request-item-spec
  (ds/spec
    {:name ::create-asset-access-request-item
     :spec create-asset-access-request-item-data}))
