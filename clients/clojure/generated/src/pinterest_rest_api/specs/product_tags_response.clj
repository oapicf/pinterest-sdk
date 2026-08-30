(ns pinterest-rest-api.specs.product-tags-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-tag-item :refer :all]
            )
  (:import (java.io File)))


(def product-tags-response-data
  {
   (ds/req :product_tags) (s/coll-of product-tag-item-spec)
   })

(def product-tags-response-spec
  (ds/spec
    {:name ::product-tags-response
     :spec product-tags-response-data}))
