(ns pinterest-rest-api.specs.product-availability-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-availability-type-data
  {
   })

(def product-availability-type-spec
  (ds/spec
    {:name ::product-availability-type
     :spec product-availability-type-data}))
