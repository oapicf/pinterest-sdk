(ns pinterest-rest-api.specs.conversion-product-report-breakdown-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-product-report-breakdown-type-data
  {
   })

(def conversion-product-report-breakdown-type-spec
  (ds/spec
    {:name ::conversion-product-report-breakdown-type
     :spec conversion-product-report-breakdown-type-data}))
