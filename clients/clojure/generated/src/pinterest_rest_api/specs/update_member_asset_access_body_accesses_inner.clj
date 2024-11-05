(ns pinterest-rest-api.specs.update-member-asset-access-body-accesses-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.permissions :refer :all]
            )
  (:import (java.io File)))


(def update-member-asset-access-body-accesses-inner-data
  {
   (ds/req :asset_id) string?
   (ds/req :member_id) string?
   (ds/req :permissions) (s/coll-of permissions-spec)
   })

(def update-member-asset-access-body-accesses-inner-spec
  (ds/spec
    {:name ::update-member-asset-access-body-accesses-inner
     :spec update-member-asset-access-body-accesses-inner-data}))
