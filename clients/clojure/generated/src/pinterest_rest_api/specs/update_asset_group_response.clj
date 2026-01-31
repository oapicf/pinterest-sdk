(ns pinterest-rest-api.specs.update-asset-group-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-asset-group-response-exceptions-inner :refer :all]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def update-asset-group-response-data
  {
   (ds/opt :exceptions) (s/coll-of update-asset-group-response-exceptions-inner-spec)
   (ds/opt :updated_asset_groups) (s/coll-of asset-group-binding-spec)
   })

(def update-asset-group-response-spec
  (ds/spec
    {:name ::update-asset-group-response
     :spec update-asset-group-response-data}))
