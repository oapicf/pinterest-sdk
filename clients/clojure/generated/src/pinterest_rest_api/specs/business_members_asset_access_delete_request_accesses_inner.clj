(ns pinterest-rest-api.specs.business-members-asset-access-delete-request-accesses-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-members-asset-access-delete-request-accesses-inner-data
  {
   (ds/req :asset_id) string?
   (ds/req :member_id) string?
   })

(def business-members-asset-access-delete-request-accesses-inner-spec
  (ds/spec
    {:name ::business-members-asset-access-delete-request-accesses-inner
     :spec business-members-asset-access-delete-request-accesses-inner-data}))
