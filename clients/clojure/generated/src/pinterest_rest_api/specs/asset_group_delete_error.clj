(ns pinterest-rest-api.specs.asset-group-delete-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-group-delete-error-data
  {
   (ds/opt :asset_group_id) string?
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def asset-group-delete-error-spec
  (ds/spec
    {:name ::asset-group-delete-error
     :spec asset-group-delete-error-data}))
