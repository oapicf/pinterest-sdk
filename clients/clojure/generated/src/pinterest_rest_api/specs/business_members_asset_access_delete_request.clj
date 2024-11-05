(ns pinterest-rest-api.specs.business-members-asset-access-delete-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-members-asset-access-delete-request-accesses-inner :refer :all]
            )
  (:import (java.io File)))


(def business-members-asset-access-delete-request-data
  {
   (ds/req :accesses) (s/coll-of business-members-asset-access-delete-request-accesses-inner-spec)
   })

(def business-members-asset-access-delete-request-spec
  (ds/spec
    {:name ::business-members-asset-access-delete-request
     :spec business-members-asset-access-delete-request-data}))
