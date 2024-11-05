(ns pinterest-rest-api.specs.asset-group-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-group-type-data
  {
   })

(def asset-group-type-spec
  (ds/spec
    {:name ::asset-group-type
     :spec asset-group-type-data}))
