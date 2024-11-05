(ns pinterest-rest-api.specs.country-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def country-filter-data
  {
   (ds/req :COUNTRY) catalogs-product-group-multiple-countries-criteria-spec
   })

(def country-filter-spec
  (ds/spec
    {:name ::country-filter
     :spec country-filter-data}))
