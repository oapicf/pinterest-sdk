(ns pinterest-rest-api.specs.price-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.price-filter-price :refer :all]
            )
  (:import (java.io File)))


(def price-filter-data
  {
   (ds/req :PRICE) price-filter-price-spec
   })

(def price-filter-spec
  (ds/spec
    {:name ::price-filter
     :spec price-filter-data}))
