(ns pinterest-rest-api.specs.product-category-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.product-categories-demographic :refer :all]
            [pinterest-rest-api.specs.product-categories-metrics-highlights :refer :all]
            [pinterest-rest-api.specs.product-category-enum :refer :all]
            )
  (:import (java.io File)))


(def product-category-details-data
  {
   (ds/opt :demographics) product-categories-demographic-spec
   (ds/req :has_prediction) boolean?
   (ds/opt :metrics_highlights) product-categories-metrics-highlights-spec
   (ds/opt :predicted_time_series) (s/map-of string? float?)
   (ds/req :product_category) product-category-enum-spec
   (ds/opt :related_searches) (s/coll-of string?)
   (ds/opt :time_series) (s/map-of string? float?)
   })

(def product-category-details-spec
  (ds/spec
    {:name ::product-category-details
     :spec product-category-details-data}))
