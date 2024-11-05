(ns pinterest-rest-api.specs.create-asset-group-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def create-asset-group-response-data
  {
   (ds/opt :asset_group) asset-group-binding-spec
   })

(def create-asset-group-response-spec
  (ds/spec
    {:name ::create-asset-group-response
     :spec create-asset-group-response-data}))
