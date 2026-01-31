(ns pinterest-rest-api.specs.vertical-product-category
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vertical-product-category-data
  {
   })

(def vertical-product-category-spec
  (ds/spec
    {:name ::vertical-product-category
     :spec vertical-product-category-data}))
