(ns pinterest-rest-api.specs.catalogs-product-group-multiple-countries-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-countries-criteria-data
  {
   (ds/req :values) (s/coll-of country-spec)
   (ds/opt :negated) boolean?
   })

(def catalogs-product-group-multiple-countries-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-countries-criteria
     :spec catalogs-product-group-multiple-countries-criteria-data}))
