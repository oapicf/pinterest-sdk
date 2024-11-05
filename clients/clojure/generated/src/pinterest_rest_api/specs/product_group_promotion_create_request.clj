(ns pinterest-rest-api.specs.product-group-promotion-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion-create-request-element :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-create-request-data
  {
   (ds/req :ad_group_id) string?
   (ds/req :product_group_promotion) (s/coll-of product-group-promotion-create-request-element-spec)
   })

(def product-group-promotion-create-request-spec
  (ds/spec
    {:name ::product-group-promotion-create-request
     :spec product-group-promotion-create-request-data}))
