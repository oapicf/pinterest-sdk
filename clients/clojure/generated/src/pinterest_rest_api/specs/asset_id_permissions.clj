(ns pinterest-rest-api.specs.asset-id-permissions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def asset-id-permissions-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) string?
   (ds/opt :permissions) (s/coll-of string?)
   (ds/opt :asset_group_info) asset-group-binding-spec
   })

(def asset-id-permissions-spec
  (ds/spec
    {:name ::asset-id-permissions
     :spec asset-id-permissions-data}))
