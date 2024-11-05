(ns pinterest-rest-api.specs.min-price-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def min-price-filter-data
  {
   (ds/req :MIN_PRICE) catalogs-product-group-pricing-criteria-spec
   })

(def min-price-filter-spec
  (ds/spec
    {:name ::min-price-filter
     :spec min-price-filter-data}))
