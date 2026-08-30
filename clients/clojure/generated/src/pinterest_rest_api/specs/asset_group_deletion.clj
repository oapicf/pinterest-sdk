(ns pinterest-rest-api.specs.asset-group-deletion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-delete-error :refer :all]
            )
  (:import (java.io File)))


(def asset-group-deletion-data
  {
   (ds/opt :deleted_asset_groups) (s/coll-of string?)
   (ds/opt :exceptions) (s/coll-of asset-group-delete-error-spec)
   })

(def asset-group-deletion-spec
  (ds/spec
    {:name ::asset-group-deletion
     :spec asset-group-deletion-data}))
