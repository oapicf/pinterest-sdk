(ns pinterest-rest-api.specs.product-group-promotions-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotions-update-with-required-body-data
  {
   (ds/req :ad_group_id) string?
   (ds/req :product_group_promotion) (s/coll-of product-group-promotion-spec)
   })

(def product-group-promotions-update-with-required-body-spec
  (ds/spec
    {:name ::product-group-promotions-update-with-required-body
     :spec product-group-promotions-update-with-required-body-data}))
