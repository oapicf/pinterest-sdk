(ns pinterest-rest-api.specs.conversion-product-report-granularity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-product-report-granularity-data
  {
   })

(def conversion-product-report-granularity-spec
  (ds/spec
    {:name ::conversion-product-report-granularity
     :spec conversion-product-report-granularity-data}))
