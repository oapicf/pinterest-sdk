(ns pinterest-rest-api.specs.order-lines-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line :refer :all]
            )
  (:import (java.io File)))


(def order-lines-list-200-response-data
  {
   (ds/req :items) (s/coll-of order-line-spec)
   (ds/opt :bookmark) string?
   })

(def order-lines-list-200-response-spec
  (ds/spec
    {:name ::order-lines-list-200-response
     :spec order-lines-list-200-response-data}))
