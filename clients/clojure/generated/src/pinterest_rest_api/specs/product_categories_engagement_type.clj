(ns pinterest-rest-api.specs.product-categories-engagement-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-categories-engagement-type-data
  {
   })

(def product-categories-engagement-type-spec
  (ds/spec
    {:name ::product-categories-engagement-type
     :spec product-categories-engagement-type-data}))
