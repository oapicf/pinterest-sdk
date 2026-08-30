(ns pinterest-rest-api.specs.conversion-product-report-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-product-report-level-data
  {
   })

(def conversion-product-report-level-spec
  (ds/spec
    {:name ::conversion-product-report-level
     :spec conversion-product-report-level-data}))
