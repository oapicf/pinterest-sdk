(ns pinterest-rest-api.specs.product-group-summary-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-group-summary-status-data
  {
   })

(def product-group-summary-status-spec
  (ds/spec
    {:name ::product-group-summary-status
     :spec product-group-summary-status-data}))
