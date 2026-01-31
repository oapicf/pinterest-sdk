(ns pinterest-rest-api.specs.custom-number3-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def custom-number3-filter-data
  {
   (ds/req :CUSTOM_NUMBER_3) catalogs-product-group-uint32-criteria-spec
   })

(def custom-number3-filter-spec
  (ds/spec
    {:name ::custom-number3-filter
     :spec custom-number3-filter-data}))
