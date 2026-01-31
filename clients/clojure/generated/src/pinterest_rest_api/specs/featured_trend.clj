(ns pinterest-rest-api.specs.featured-trend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.interests-enum :refer :all]
            [pinterest-rest-api.specs.product-category-region :refer :all]
            [pinterest-rest-api.specs.trending-topic :refer :all]
            )
  (:import (java.io File)))


(def featured-trend-data
  {
   (ds/req :interest) interests-enum-spec
   (ds/opt :market) product-category-region-spec
   (ds/opt :trends) (s/coll-of trending-topic-spec)
   })

(def featured-trend-spec
  (ds/spec
    {:name ::featured-trend
     :spec featured-trend-data}))
