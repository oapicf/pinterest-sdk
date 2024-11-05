(ns pinterest-rest-api.specs.hotel-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def hotel-id-filter-data
  {
   (ds/req :HOTEL_ID) catalogs-product-group-multiple-string-criteria-spec
   })

(def hotel-id-filter-spec
  (ds/spec
    {:name ::hotel-id-filter
     :spec hotel-id-filter-data}))
