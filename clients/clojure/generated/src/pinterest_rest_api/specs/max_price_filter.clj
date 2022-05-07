(ns pinterest-rest-api.specs.max-price-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def max-price-filter-data
  {
   (ds/req :MAX_PRICE) catalogs-product-group-pricing-criteria-spec
   })

(def max-price-filter-spec
  (ds/spec
    {:name ::max-price-filter
     :spec max-price-filter-data}))
