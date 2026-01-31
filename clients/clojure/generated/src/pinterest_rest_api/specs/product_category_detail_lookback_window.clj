(ns pinterest-rest-api.specs.product-category-detail-lookback-window
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-detail-lookback-window-data
  {
   })

(def product-category-detail-lookback-window-spec
  (ds/spec
    {:name ::product-category-detail-lookback-window
     :spec product-category-detail-lookback-window-data}))
