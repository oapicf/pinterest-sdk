(ns pinterest-rest-api.specs.asset-group-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-group-binding :refer :all]
            )
  (:import (java.io File)))


(def asset-group-input-data
  {
   (ds/opt :asset_group) asset-group-binding-spec
   })

(def asset-group-input-spec
  (ds/spec
    {:name ::asset-group-input
     :spec asset-group-input-data}))
