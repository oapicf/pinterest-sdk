(ns pinterest-rest-api.specs.catalogs-product-group-pricing-currency-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.non-nullable-catalogs-currency :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-pricing-currency-criteria-data
  {
   (ds/req :operator) string?
   (ds/req :value) float?
   (ds/req :currency) non-nullable-catalogs-currency-spec
   (ds/opt :negated) boolean?
   })

(def catalogs-product-group-pricing-currency-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-pricing-currency-criteria
     :spec catalogs-product-group-pricing-currency-criteria-data}))
