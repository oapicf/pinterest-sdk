(ns pinterest-rest-api.specs.catalogs-product-group-currency-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.non-nullable-catalogs-currency :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-currency-criteria-data
  {
   (ds/req :values) non-nullable-catalogs-currency-spec
   (ds/req :negated) boolean?
   })

(def catalogs-product-group-currency-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-currency-criteria
     :spec catalogs-product-group-currency-criteria-data}))
