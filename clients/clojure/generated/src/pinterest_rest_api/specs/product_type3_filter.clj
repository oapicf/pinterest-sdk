(ns pinterest-rest-api.specs.product-type3-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-type3-filter-data
  {
   (ds/req :PRODUCT_TYPE_3) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def product-type3-filter-spec
  (ds/spec
    {:name ::product-type3-filter
     :spec product-type3-filter-data}))
