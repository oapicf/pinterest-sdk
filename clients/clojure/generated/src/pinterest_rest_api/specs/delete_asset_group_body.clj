(ns pinterest-rest-api.specs.delete-asset-group-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-asset-group-body-data
  {
   (ds/req :asset_groups_to_delete) (s/coll-of string?)
   })

(def delete-asset-group-body-spec
  (ds/spec
    {:name ::delete-asset-group-body
     :spec delete-asset-group-body-data}))
