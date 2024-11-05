(ns pinterest-rest-api.specs.order-line-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-error :refer :all]
            [pinterest-rest-api.specs.order-line :refer :all]
            )
  (:import (java.io File)))


(def order-line-response-data
  {
   (ds/opt :errors) (s/coll-of order-line-error-spec)
   (ds/opt :order_line) (s/coll-of order-line-spec)
   })

(def order-line-response-spec
  (ds/spec
    {:name ::order-line-response
     :spec order-line-response-data}))
