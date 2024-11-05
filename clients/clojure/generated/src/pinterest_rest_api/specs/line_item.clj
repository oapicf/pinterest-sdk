(ns pinterest-rest-api.specs.line-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def line-item-data
  {
   (ds/opt :product_brand) string?
   (ds/opt :product_category) string?
   (ds/opt :product_id) int?
   (ds/opt :product_name) string?
   (ds/opt :product_price) string?
   (ds/opt :product_quantity) int?
   (ds/opt :product_variant) string?
   (ds/opt :product_variant_id) string?
   })

(def line-item-spec
  (ds/spec
    {:name ::line-item
     :spec line-item-data}))
