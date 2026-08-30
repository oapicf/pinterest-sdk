(ns pinterest-rest-api.specs.conversion-objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-objective-type-data
  {
   })

(def conversion-objective-type-spec
  (ds/spec
    {:name ::conversion-objective-type
     :spec conversion-objective-type-data}))
