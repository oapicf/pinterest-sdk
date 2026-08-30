(ns pinterest-rest-api.specs.asset-permission-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-permission-type-data
  {
   })

(def asset-permission-type-spec
  (ds/spec
    {:name ::asset-permission-type
     :spec asset-permission-type-data}))
