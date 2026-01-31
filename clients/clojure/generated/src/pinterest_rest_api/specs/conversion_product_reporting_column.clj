(ns pinterest-rest-api.specs.conversion-product-reporting-column
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-product-reporting-column-data
  {
   })

(def conversion-product-reporting-column-spec
  (ds/spec
    {:name ::conversion-product-reporting-column
     :spec conversion-product-reporting-column-data}))
