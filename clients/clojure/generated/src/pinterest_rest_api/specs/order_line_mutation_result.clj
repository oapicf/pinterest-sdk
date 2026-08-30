(ns pinterest-rest-api.specs.order-line-mutation-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-mutation-error :refer :all]
            [pinterest-rest-api.specs.order-line :refer :all]
            )
  (:import (java.io File)))


(def order-line-mutation-result-data
  {
   (ds/opt :errors) (s/coll-of order-line-mutation-error-spec)
   (ds/opt :order_line) (s/coll-of order-line-spec)
   })

(def order-line-mutation-result-spec
  (ds/spec
    {:name ::order-line-mutation-result
     :spec order-line-mutation-result-data}))
