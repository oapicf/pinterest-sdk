(ns pinterest-rest-api.specs.product-group-promotion-response-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion-response-element :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotion-response-item-data
  {
   (ds/opt :data) product-group-promotion-response-element-spec
   (ds/opt :exceptions) (s/coll-of exception-spec)
   })

(def product-group-promotion-response-item-spec
  (ds/spec
    {:name ::product-group-promotion-response-item
     :spec product-group-promotion-response-item-data}))
