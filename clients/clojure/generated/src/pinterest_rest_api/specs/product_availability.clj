(ns pinterest-rest-api.specs.product-availability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-availability-data
  {
   })

(def product-availability-spec
  (ds/spec
    {:name ::product-availability
     :spec product-availability-data}))
