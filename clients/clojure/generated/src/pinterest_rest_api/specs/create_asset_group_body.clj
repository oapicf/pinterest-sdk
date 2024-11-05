(ns pinterest-rest-api.specs.create-asset-group-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-type :refer :all]
            )
  (:import (java.io File)))


(def create-asset-group-body-data
  {
   (ds/req :asset_group_name) string?
   (ds/req :asset_group_description) string?
   (ds/req :asset_group_types) (s/coll-of asset-group-type-spec)
   })

(def create-asset-group-body-spec
  (ds/spec
    {:name ::create-asset-group-body
     :spec create-asset-group-body-data}))
