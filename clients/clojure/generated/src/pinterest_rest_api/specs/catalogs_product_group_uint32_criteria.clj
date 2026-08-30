(ns pinterest-rest-api.specs.catalogs-product-group-uint32-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.numeric-filter-operator-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-uint32-criteria-data
  {
   (ds/opt :negated) boolean?
   (ds/req :operator) numeric-filter-operator-type-spec
   (ds/req :value) int?
   })

(def catalogs-product-group-uint32-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-uint32-criteria
     :spec catalogs-product-group-uint32-criteria-data}))
