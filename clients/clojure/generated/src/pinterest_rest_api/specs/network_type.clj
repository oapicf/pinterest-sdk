(ns pinterest-rest-api.specs.network-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def network-type-data
  {
   })

(def network-type-spec
  (ds/spec
    {:name ::network-type
     :spec network-type-data}))
