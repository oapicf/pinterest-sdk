(ns pinterest-rest-api.specs.product-category-region
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-region-data
  {
   })

(def product-category-region-spec
  (ds/spec
    {:name ::product-category-region
     :spec product-category-region-data}))
