(ns pinterest-rest-api.specs.get-partner-assets-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def get-partner-assets-response-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) string?
   (ds/opt :permissions) (s/coll-of string?)
   (ds/opt :asset_group_info) asset-group-binding-spec
   })

(def get-partner-assets-response-spec
  (ds/spec
    {:name ::get-partner-assets-response
     :spec get-partner-assets-response-data}))
