(ns pinterest-rest-api.specs.trending-product-category
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-categories-engagement-type :refer :all]
            [pinterest-rest-api.specs.vertical-product-category :refer :all]
            )
  (:import (java.io File)))


(def trending-product-category-data
  {
   (ds/req :engagement_type) product-categories-engagement-type-spec
   (ds/req :pct_change_mom) int?
   (ds/req :percent_relative_volume) int?
   (ds/req :product_category) string?
   (ds/opt :verticals) (s/coll-of vertical-product-category-spec)
   })

(def trending-product-category-spec
  (ds/spec
    {:name ::trending-product-category
     :spec trending-product-category-data}))
