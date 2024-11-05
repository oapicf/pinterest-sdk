(ns pinterest-rest-api.specs.availability-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def availability-filter-data
  {
   (ds/req :AVAILABILITY) catalogs-product-group-multiple-string-criteria-spec
   })

(def availability-filter-spec
  (ds/spec
    {:name ::availability-filter
     :spec availability-filter-data}))
