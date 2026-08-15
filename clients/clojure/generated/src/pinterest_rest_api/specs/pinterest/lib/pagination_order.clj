(ns pinterest-rest-api.specs.pinterest/lib/pagination-order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pinterest/lib/pagination-order-data
  {
   })

(def pinterest/lib/pagination-order-spec
  (ds/spec
    {:name ::pinterest/lib/pagination-order
     :spec pinterest/lib/pagination-order-data}))
