(ns pinterest-rest-api.specs.product-tags-bulk-add-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-tag-item :refer :all]
            )
  (:import (java.io File)))


(def product-tags-bulk-add-request-data
  {
   (ds/req :product_tags) (s/coll-of product-tag-item-spec)
   })

(def product-tags-bulk-add-request-spec
  (ds/spec
    {:name ::product-tags-bulk-add-request
     :spec product-tags-bulk-add-request-data}))
