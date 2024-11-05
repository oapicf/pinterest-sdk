(ns pinterest-rest-api.specs.product-type1-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-type1-filter-data
  {
   (ds/req :PRODUCT_TYPE_1) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def product-type1-filter-spec
  (ds/spec
    {:name ::product-type1-filter
     :spec product-type1-filter-data}))
