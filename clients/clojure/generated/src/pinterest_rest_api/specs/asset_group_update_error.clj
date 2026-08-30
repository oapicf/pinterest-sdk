(ns pinterest-rest-api.specs.asset-group-update-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-group-update-error-data
  {
   (ds/opt :asset_group_id) string?
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def asset-group-update-error-spec
  (ds/spec
    {:name ::asset-group-update-error
     :spec asset-group-update-error-data}))
