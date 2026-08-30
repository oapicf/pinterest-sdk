(ns pinterest-rest-api.specs.catalogs-product-group-multiple-pinterest-product-category-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-category-enum :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-pinterest-product-category-criteria-data
  {
   (ds/opt :negated) boolean?
   (ds/req :values) (s/coll-of product-category-enum-spec)
   })

(def catalogs-product-group-multiple-pinterest-product-category-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-pinterest-product-category-criteria
     :spec catalogs-product-group-multiple-pinterest-product-category-criteria-data}))
