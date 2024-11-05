(ns pinterest-rest-api.specs.product-group-reference-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def product-group-reference-filter-data
  {
   (ds/req :PRODUCT_GROUP) catalogs-product-group-multiple-string-criteria-spec
   })

(def product-group-reference-filter-spec
  (ds/spec
    {:name ::product-group-reference-filter
     :spec product-group-reference-filter-data}))
