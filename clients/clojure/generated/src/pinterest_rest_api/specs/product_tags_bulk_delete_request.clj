(ns pinterest-rest-api.specs.product-tags-bulk-delete-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-tag-item :refer :all]
            )
  (:import (java.io File)))


(def product-tags-bulk-delete-request-data
  {
   (ds/req :product_tags) (s/coll-of product-tag-item-spec)
   })

(def product-tags-bulk-delete-request-spec
  (ds/spec
    {:name ::product-tags-bulk-delete-request
     :spec product-tags-bulk-delete-request-data}))
