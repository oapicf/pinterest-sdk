(ns pinterest-rest-api.specs.product-type0-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-type0-filter-data
  {
   (ds/req :PRODUCT_TYPE_0) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def product-type0-filter-spec
  (ds/spec
    {:name ::product-type0-filter
     :spec product-type0-filter-data}))
