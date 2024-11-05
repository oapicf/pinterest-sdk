(ns pinterest-rest-api.specs.update-asset-group-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-asset-group-body-asset-groups-to-update-inner :refer :all]
            )
  (:import (java.io File)))


(def update-asset-group-body-data
  {
   (ds/opt :asset_groups_to_update) (s/coll-of update-asset-group-body-asset-groups-to-update-inner-spec)
   })

(def update-asset-group-body-spec
  (ds/spec
    {:name ::update-asset-group-body
     :spec update-asset-group-body-data}))
