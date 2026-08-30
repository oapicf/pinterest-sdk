(ns pinterest-rest-api.specs.product-group-promotions-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotions-create-data
  {
   (ds/req :ad_group_id) string?
   (ds/req :product_group_promotion) (s/coll-of product-group-promotion-spec)
   })

(def product-group-promotions-create-spec
  (ds/spec
    {:name ::product-group-promotions-create
     :spec product-group-promotions-create-data}))
