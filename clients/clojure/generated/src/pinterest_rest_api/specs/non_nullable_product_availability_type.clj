(ns pinterest-rest-api.specs.non-nullable-product-availability-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def non-nullable-product-availability-type-data
  {
   })

(def non-nullable-product-availability-type-spec
  (ds/spec
    {:name ::non-nullable-product-availability-type
     :spec non-nullable-product-availability-type-data}))
