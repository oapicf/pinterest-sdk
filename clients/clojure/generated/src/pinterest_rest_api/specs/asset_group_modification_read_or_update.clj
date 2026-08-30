(ns pinterest-rest-api.specs.asset-group-modification-read-or-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-update-item-read-or-update-item :refer :all]
            [pinterest-rest-api.specs.asset-group-update-error :refer :all]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def asset-group-modification-read-or-update-data
  {
   (ds/opt :asset_groups_to_update) (s/coll-of asset-group-update-item-read-or-update-item-spec)
   (ds/opt :exceptions) (s/coll-of asset-group-update-error-spec)
   (ds/opt :updated_asset_groups) (s/coll-of asset-group-binding-spec)
   })

(def asset-group-modification-read-or-update-spec
  (ds/spec
    {:name ::asset-group-modification-read-or-update
     :spec asset-group-modification-read-or-update-data}))
