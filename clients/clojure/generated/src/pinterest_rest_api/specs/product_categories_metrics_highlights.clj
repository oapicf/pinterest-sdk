(ns pinterest-rest-api.specs.product-categories-metrics-highlights
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.inner-product-categories-metrics-highlights :refer :all]
            [pinterest-rest-api.specs.inner-product-categories-metrics-highlights :refer :all]
            [pinterest-rest-api.specs.inner-product-categories-metrics-highlights :refer :all]
            )
  (:import (java.io File)))


(def product-categories-metrics-highlights-data
  {
   (ds/opt :engagement) inner-product-categories-metrics-highlights-spec
   (ds/opt :outbound_clicks) inner-product-categories-metrics-highlights-spec
   (ds/opt :pin_saves) inner-product-categories-metrics-highlights-spec
   })

(def product-categories-metrics-highlights-spec
  (ds/spec
    {:name ::product-categories-metrics-highlights
     :spec product-categories-metrics-highlights-data}))
