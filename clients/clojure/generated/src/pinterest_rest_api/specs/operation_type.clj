(ns pinterest-rest-api.specs.operation-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def operation-type-data
  {
   })

(def operation-type-spec
  (ds/spec
    {:name ::operation-type
     :spec operation-type-data}))
