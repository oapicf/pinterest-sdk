(ns pinterest-rest-api.specs.catalogs-product-group-multiple-gender-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.gender :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-gender-criteria-data
  {
   (ds/opt :negated) boolean?
   (ds/req :values) (s/coll-of gender-spec)
   })

(def catalogs-product-group-multiple-gender-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-gender-criteria
     :spec catalogs-product-group-multiple-gender-criteria-data}))
