(ns pinterest-rest-api.specs.asset-group-update-item-read-or-update-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-type :refer :all]
            )
  (:import (java.io File)))


(def asset-group-update-item-read-or-update-item-data
  {
   (ds/req :asset_group_id) string?
   (ds/opt :asset_group_types) (s/coll-of asset-group-type-spec)
   (ds/opt :assets_to_add) (s/coll-of string?)
   (ds/opt :assets_to_remove) (s/coll-of string?)
   (ds/opt :description) string?
   (ds/opt :name) string?
   })

(def asset-group-update-item-read-or-update-item-spec
  (ds/spec
    {:name ::asset-group-update-item-read-or-update-item
     :spec asset-group-update-item-read-or-update-item-data}))
