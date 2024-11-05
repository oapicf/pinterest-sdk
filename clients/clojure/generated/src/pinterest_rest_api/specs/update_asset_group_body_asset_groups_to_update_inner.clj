(ns pinterest-rest-api.specs.update-asset-group-body-asset-groups-to-update-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-type :refer :all]
            )
  (:import (java.io File)))


(def update-asset-group-body-asset-groups-to-update-inner-data
  {
   (ds/req :asset_group_id) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :asset_group_types) (s/coll-of asset-group-type-spec)
   (ds/opt :assets_to_add) (s/coll-of string?)
   (ds/opt :assets_to_remove) (s/coll-of string?)
   })

(def update-asset-group-body-asset-groups-to-update-inner-spec
  (ds/spec
    {:name ::update-asset-group-body-asset-groups-to-update-inner
     :spec update-asset-group-body-asset-groups-to-update-inner-data}))
