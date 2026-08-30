(ns pinterest-rest-api.specs.base-business-assets
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            [pinterest-rest-api.specs.asset-type-response :refer :all]
            )
  (:import (java.io File)))


(def base-business-assets-data
  {
   (ds/opt :asset_group_info) asset-group-binding-spec
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) asset-type-response-spec
   (ds/opt :permissions) (s/coll-of string?)
   })

(def base-business-assets-spec
  (ds/spec
    {:name ::base-business-assets
     :spec base-business-assets-data}))
