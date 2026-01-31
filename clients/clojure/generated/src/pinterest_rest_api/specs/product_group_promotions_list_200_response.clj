(ns pinterest-rest-api.specs.product-group-promotions-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-group-promotion :refer :all]
            )
  (:import (java.io File)))


(def product-group-promotions-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of product-group-promotion-spec)
   })

(def product-group-promotions-list-200-response-spec
  (ds/spec
    {:name ::product-group-promotions-list-200-response
     :spec product-group-promotions-list-200-response-data}))
