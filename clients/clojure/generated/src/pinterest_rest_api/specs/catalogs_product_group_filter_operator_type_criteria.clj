(ns pinterest-rest-api.specs.catalogs-product-group-filter-operator-type-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-filter-operator-type-criteria-data
  {
   (ds/opt :filter_operator_type) string?
   (ds/opt :negated) boolean?
   (ds/req :values) (s/coll-of string?)
   })

(def catalogs-product-group-filter-operator-type-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-filter-operator-type-criteria
     :spec catalogs-product-group-filter-operator-type-criteria-data}))
