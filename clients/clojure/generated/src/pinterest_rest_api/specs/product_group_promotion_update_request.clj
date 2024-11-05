(ns pinterest-rest-api.specs.product-group-promotion-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-update-request-data
  {
   (ds/req :ad_group_id) string?
   (ds/req :product_group_promotion) (s/coll-of product-group-promotion-spec)
   })

(def product-group-promotion-update-request-spec
  (ds/spec
    {:name ::product-group-promotion-update-request
     :spec product-group-promotion-update-request-data}))
