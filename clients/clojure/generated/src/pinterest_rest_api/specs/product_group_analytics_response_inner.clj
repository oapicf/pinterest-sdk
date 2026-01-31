(ns pinterest-rest-api.specs.product-group-analytics-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-group-analytics-response-inner-data
  {
   (ds/opt :DATE) inst?
   (ds/req :PRODUCT_GROUP_ID) string?
   })

(def product-group-analytics-response-inner-spec
  (ds/spec
    {:name ::product-group-analytics-response-inner
     :spec product-group-analytics-response-inner-data}))
