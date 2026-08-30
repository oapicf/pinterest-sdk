(ns pinterest-rest-api.specs.nullable-partner-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-partner-type-data
  {
   })

(def nullable-partner-type-spec
  (ds/spec
    {:name ::nullable-partner-type
     :spec nullable-partner-type-data}))
