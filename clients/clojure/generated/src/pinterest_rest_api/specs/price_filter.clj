(ns pinterest-rest-api.specs.price-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-pricing-currency-criteria :refer :all]
            )
  (:import (java.io File)))


(def price-filter-data
  {
   (ds/req :PRICE) catalogs-product-group-pricing-currency-criteria-spec
   })

(def price-filter-spec
  (ds/spec
    {:name ::price-filter
     :spec price-filter-data}))
