(ns pinterest-rest-api.specs.asset-group-input-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            [pinterest-rest-api.specs.asset-group-type :refer :all]
            )
  (:import (java.io File)))


(def asset-group-input-create-data
  {
   (ds/opt :asset_group) asset-group-binding-spec
   (ds/req :asset_group_description) string?
   (ds/req :asset_group_name) string?
   (ds/req :asset_group_types) (s/coll-of asset-group-type-spec)
   })

(def asset-group-input-create-spec
  (ds/spec
    {:name ::asset-group-input-create
     :spec asset-group-input-create-data}))
