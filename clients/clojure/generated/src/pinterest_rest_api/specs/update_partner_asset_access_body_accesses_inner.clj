(ns pinterest-rest-api.specs.update-partner-asset-access-body-accesses-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.permissions :refer :all]
            )
  (:import (java.io File)))


(def update-partner-asset-access-body-accesses-inner-data
  {
   (ds/req :partner_id) string?
   (ds/req :asset_id) string?
   (ds/req :permissions) (s/coll-of permissions-spec)
   })

(def update-partner-asset-access-body-accesses-inner-spec
  (ds/spec
    {:name ::update-partner-asset-access-body-accesses-inner
     :spec update-partner-asset-access-body-accesses-inner-data}))
