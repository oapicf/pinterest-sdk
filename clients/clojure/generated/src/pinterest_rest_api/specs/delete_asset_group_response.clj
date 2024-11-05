(ns pinterest-rest-api.specs.delete-asset-group-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-asset-group-response-exceptions-inner :refer :all]
            )
  (:import (java.io File)))


(def delete-asset-group-response-data
  {
   (ds/opt :deleted_asset_groups) (s/coll-of string?)
   (ds/opt :exceptions) (s/coll-of delete-asset-group-response-exceptions-inner-spec)
   })

(def delete-asset-group-response-spec
  (ds/spec
    {:name ::delete-asset-group-response
     :spec delete-asset-group-response-data}))
