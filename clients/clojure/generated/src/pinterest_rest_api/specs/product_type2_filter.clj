(ns pinterest-rest-api.specs.product-type2-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-type2-filter-data
  {
   (ds/req :PRODUCT_TYPE_2) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def product-type2-filter-spec
  (ds/spec
    {:name ::product-type2-filter
     :spec product-type2-filter-data}))
