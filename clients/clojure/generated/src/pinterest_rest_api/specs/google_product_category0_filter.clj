(ns pinterest-rest-api.specs.google-product-category0-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def google-product-category0-filter-data
  {
   (ds/req :GOOGLE_PRODUCT_CATEGORY_0) catalogs-product-group-multiple-string-list-criteria-spec
   })

(def google-product-category0-filter-spec
  (ds/spec
    {:name ::google-product-category0-filter
     :spec google-product-category0-filter-data}))
