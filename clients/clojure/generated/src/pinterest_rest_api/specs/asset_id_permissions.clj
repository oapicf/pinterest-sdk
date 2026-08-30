(ns pinterest-rest-api.specs.asset-id-permissions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            [pinterest-rest-api.specs.asset-type-response :refer :all]
            )
  (:import (java.io File)))


(def asset-id-permissions-data
  {
   (ds/opt :asset_group_info) asset-group-binding-spec
   (ds/req :asset_id) string?
   (ds/req :asset_type) asset-type-response-spec
   (ds/req :permissions) (s/coll-of string?)
   })

(def asset-id-permissions-spec
  (ds/spec
    {:name ::asset-id-permissions
     :spec asset-id-permissions-data}))
