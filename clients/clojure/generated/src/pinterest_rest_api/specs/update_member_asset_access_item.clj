(ns pinterest-rest-api.specs.update-member-asset-access-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.permissions :refer :all]
            )
  (:import (java.io File)))


(def update-member-asset-access-item-data
  {
   (ds/req :asset_id) string?
   (ds/req :member_id) string?
   (ds/req :permissions) (s/coll-of permissions-spec)
   })

(def update-member-asset-access-item-spec
  (ds/spec
    {:name ::update-member-asset-access-item
     :spec update-member-asset-access-item-data}))
