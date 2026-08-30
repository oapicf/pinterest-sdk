(ns pinterest-rest-api.specs.carting-product
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.carting-retailer :refer :all]
            )
  (:import (java.io File)))


(def carting-product-data
  {
   (ds/req :carting_product_id) string?
   (ds/opt :display_preferred_retailers_only) boolean?
   (ds/opt :display_product_price) boolean?
   (ds/opt :preferred_retailers) (s/coll-of carting-retailer-spec)
   (ds/opt :randomize_preferred_retailers) boolean?
   })

(def carting-product-spec
  (ds/spec
    {:name ::carting-product
     :spec carting-product-data}))
