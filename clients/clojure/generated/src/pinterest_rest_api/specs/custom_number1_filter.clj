(ns pinterest-rest-api.specs.custom-number1-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-number1-filter-data
  {
   (ds/req :CUSTOM_NUMBER_1) catalogs-product-group-uint32-criteria-spec
   })

(def custom-number1-filter-spec
  (ds/spec
    {:name ::custom-number1-filter
     :spec custom-number1-filter-data}))
