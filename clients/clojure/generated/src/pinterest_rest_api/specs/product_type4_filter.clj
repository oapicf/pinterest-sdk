(ns pinterest-rest-api.specs.product-type4-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-type4-filter-data
  {
   (ds/req :PRODUCT_TYPE_4) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def product-type4-filter-spec
  (ds/spec
    {:name ::product-type4-filter
     :spec product-type4-filter-data}))
