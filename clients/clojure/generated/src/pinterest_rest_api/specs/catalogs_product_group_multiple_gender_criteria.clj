(ns pinterest-rest-api.specs.catalogs-product-group-multiple-gender-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.gender :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-gender-criteria-data
  {
   (ds/req :values) (s/coll-of gender-spec)
   (ds/opt :negated) boolean?
   })

(def catalogs-product-group-multiple-gender-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-gender-criteria
     :spec catalogs-product-group-multiple-gender-criteria-data}))
