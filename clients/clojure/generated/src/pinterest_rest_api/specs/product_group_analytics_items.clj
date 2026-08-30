(ns pinterest-rest-api.specs.product-group-analytics-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-group-analytics-items-data
  {
   (ds/opt :DATE) inst?
   (ds/req :PRODUCT_GROUP_ID) string?
   })

(def product-group-analytics-items-spec
  (ds/spec
    {:name ::product-group-analytics-items
     :spec product-group-analytics-items-data}))
