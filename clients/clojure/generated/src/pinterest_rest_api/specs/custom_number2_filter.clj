(ns pinterest-rest-api.specs.custom-number2-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-uint32-criteria :refer :all]
            )
  (:import (java.io File)))


(def custom-number2-filter-data
  {
   (ds/req :CUSTOM_NUMBER_2) catalogs-product-group-uint32-criteria-spec
   })

(def custom-number2-filter-spec
  (ds/spec
    {:name ::custom-number2-filter
     :spec custom-number2-filter-data}))
