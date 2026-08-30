(ns pinterest-rest-api.specs.filter-operator-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def filter-operator-type-data
  {
   })

(def filter-operator-type-spec
  (ds/spec
    {:name ::filter-operator-type
     :spec filter-operator-type-data}))
