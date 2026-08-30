(ns pinterest-rest-api.specs.custom-number4-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-uint32-criteria :refer :all]
            )
  (:import (java.io File)))


(def custom-number4-filter-data
  {
   (ds/req :CUSTOM_NUMBER_4) catalogs-product-group-uint32-criteria-spec
   })

(def custom-number4-filter-spec
  (ds/spec
    {:name ::custom-number4-filter
     :spec custom-number4-filter-data}))
