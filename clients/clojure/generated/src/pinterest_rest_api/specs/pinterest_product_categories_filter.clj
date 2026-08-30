(ns pinterest-rest-api.specs.pinterest-product-categories-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-multiple-pinterest-product-category-criteria :refer :all]
            )
  (:import (java.io File)))


(def pinterest-product-categories-filter-data
  {
   (ds/req :PINTEREST_PRODUCT_CATEGORIES) catalogs-product-group-multiple-pinterest-product-category-criteria-spec
   })

(def pinterest-product-categories-filter-spec
  (ds/spec
    {:name ::pinterest-product-categories-filter
     :spec pinterest-product-categories-filter-data}))
