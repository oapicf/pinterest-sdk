(ns pinterest-rest-api.specs.product-group-promotions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion-response-item :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotions-data
  {
   (ds/opt :items) (s/coll-of product-group-promotion-response-item-spec)
   })

(def product-group-promotions-spec
  (ds/spec
    {:name ::product-group-promotions
     :spec product-group-promotions-data}))
