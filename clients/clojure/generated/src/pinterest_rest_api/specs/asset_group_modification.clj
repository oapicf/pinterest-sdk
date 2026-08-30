(ns pinterest-rest-api.specs.asset-group-modification
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-update-error :refer :all]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def asset-group-modification-data
  {
   (ds/opt :exceptions) (s/coll-of asset-group-update-error-spec)
   (ds/opt :updated_asset_groups) (s/coll-of asset-group-binding-spec)
   })

(def asset-group-modification-spec
  (ds/spec
    {:name ::asset-group-modification
     :spec asset-group-modification-data}))
