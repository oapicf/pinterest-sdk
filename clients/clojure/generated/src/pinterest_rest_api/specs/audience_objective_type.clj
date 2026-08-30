(ns pinterest-rest-api.specs.audience-objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-objective-type-data
  {
   })

(def audience-objective-type-spec
  (ds/spec
    {:name ::audience-objective-type
     :spec audience-objective-type-data}))
