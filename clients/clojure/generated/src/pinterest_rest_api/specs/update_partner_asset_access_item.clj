(ns pinterest-rest-api.specs.update-partner-asset-access-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.permissions :refer :all]
            )
  (:import (java.io File)))


(def update-partner-asset-access-item-data
  {
   (ds/req :asset_id) string?
   (ds/req :partner_id) string?
   (ds/req :permissions) (s/coll-of permissions-spec)
   })

(def update-partner-asset-access-item-spec
  (ds/spec
    {:name ::update-partner-asset-access-item
     :spec update-partner-asset-access-item-data}))
