(ns pinterest-rest-api.specs.numeric-filter-operator-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def numeric-filter-operator-type-data
  {
   })

(def numeric-filter-operator-type-spec
  (ds/spec
    {:name ::numeric-filter-operator-type
     :spec numeric-filter-operator-type-data}))
