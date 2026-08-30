(ns pinterest-rest-api.specs.asset-group-deletion-delete
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-group-deletion-delete-data
  {
   (ds/req :asset_groups_to_delete) (s/coll-of string?)
   })

(def asset-group-deletion-delete-spec
  (ds/spec
    {:name ::asset-group-deletion-delete
     :spec asset-group-deletion-delete-data}))
