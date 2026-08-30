(ns pinterest-rest-api.specs.catalogs-product-group-filter-operator-type-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.filter-operator-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-filter-operator-type-criteria-data
  {
   (ds/opt :filter_operator_type) filter-operator-type-spec
   (ds/opt :negated) boolean?
   (ds/req :values) (s/coll-of string?)
   })

(def catalogs-product-group-filter-operator-type-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-filter-operator-type-criteria
     :spec catalogs-product-group-filter-operator-type-criteria-data}))
