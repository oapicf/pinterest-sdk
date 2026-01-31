(ns pinterest-rest-api.specs.product-category-enum
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-enum-data
  {
   })

(def product-category-enum-spec
  (ds/spec
    {:name ::product-category-enum
     :spec product-category-enum-data}))
