(ns pinterest-rest-api.specs.nullable-label-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-label-type-data
  {
   })

(def nullable-label-type-spec
  (ds/spec
    {:name ::nullable-label-type
     :spec nullable-label-type-data}))
