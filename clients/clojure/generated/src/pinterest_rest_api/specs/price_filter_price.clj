(ns pinterest-rest-api.specs.price-filter-price
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.non-nullable-catalogs-currency :refer :all]
            [pinterest-rest-api.specs.numeric-filter-operator-type :refer :all]
            )
  (:import (java.io File)))


(def price-filter-price-data
  {
   (ds/req :currency) non-nullable-catalogs-currency-spec
   (ds/opt :negated) boolean?
   (ds/req :operator) numeric-filter-operator-type-spec
   (ds/req :value) float?
   })

(def price-filter-price-spec
  (ds/spec
    {:name ::price-filter-price
     :spec price-filter-price-data}))
