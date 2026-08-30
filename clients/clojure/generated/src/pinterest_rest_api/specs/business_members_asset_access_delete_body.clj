(ns pinterest-rest-api.specs.business-members-asset-access-delete-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-member-asset-access-item :refer :all]
            )
  (:import (java.io File)))


(def business-members-asset-access-delete-body-data
  {
   (ds/req :accesses) (s/coll-of delete-member-asset-access-item-spec)
   })

(def business-members-asset-access-delete-body-spec
  (ds/spec
    {:name ::business-members-asset-access-delete-body
     :spec business-members-asset-access-delete-body-data}))
