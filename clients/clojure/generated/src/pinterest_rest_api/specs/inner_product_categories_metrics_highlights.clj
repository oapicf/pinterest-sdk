(ns pinterest-rest-api.specs.inner-product-categories-metrics-highlights
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inner-product-categories-metrics-highlights-data
  {
   (ds/req :pct_change_mom) float?
   })

(def inner-product-categories-metrics-highlights-spec
  (ds/spec
    {:name ::inner-product-categories-metrics-highlights
     :spec inner-product-categories-metrics-highlights-data}))
