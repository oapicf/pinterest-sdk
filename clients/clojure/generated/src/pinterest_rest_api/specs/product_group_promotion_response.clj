(ns pinterest-rest-api.specs.product-group-promotion-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion-response-item :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-response-data
  {
   (ds/opt :items) (s/coll-of product-group-promotion-response-item-spec)
   })

(def product-group-promotion-response-spec
  (ds/spec
    {:name ::product-group-promotion-response
     :spec product-group-promotion-response-data}))
