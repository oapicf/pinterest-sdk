(ns pinterest-rest-api.specs.currency-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def currency-filter-data
  {
   (ds/req :CURRENCY) catalogs-product-group-currency-criteria-spec
   })

(def currency-filter-spec
  (ds/spec
    {:name ::currency-filter
     :spec currency-filter-data}))
