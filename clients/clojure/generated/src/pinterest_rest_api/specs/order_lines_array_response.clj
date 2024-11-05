(ns pinterest-rest-api.specs.order-lines-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-lines :refer :all]
            )
  (:import (java.io File)))


(def order-lines-array-response-data
  {
   (ds/opt :items) (s/coll-of order-lines-spec)
   })

(def order-lines-array-response-spec
  (ds/spec
    {:name ::order-lines-array-response
     :spec order-lines-array-response-data}))
