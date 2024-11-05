(ns pinterest-rest-api.specs.get-business-assets-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def get-business-assets-response-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) string?
   (ds/opt :asset_group_info) asset-group-binding-spec
   })

(def get-business-assets-response-spec
  (ds/spec
    {:name ::get-business-assets-response
     :spec get-business-assets-response-data}))
