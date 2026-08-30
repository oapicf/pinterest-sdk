(ns pinterest-rest-api.specs.delete-member-asset-access-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-member-asset-access-item-data
  {
   (ds/req :asset_id) string?
   (ds/req :member_id) string?
   })

(def delete-member-asset-access-item-spec
  (ds/spec
    {:name ::delete-member-asset-access-item
     :spec delete-member-asset-access-item-data}))
