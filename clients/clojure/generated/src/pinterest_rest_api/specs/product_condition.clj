(ns pinterest-rest-api.specs.product-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-condition-data
  {
   })

(def product-condition-spec
  (ds/spec
    {:name ::product-condition
     :spec product-condition-data}))
