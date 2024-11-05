(ns pinterest-rest-api.specs.catalogs-hotel-product-group-filters-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-group-filters-all-of-data
  {
   (ds/req :all_of) (s/coll-of catalogs-hotel-product-group-filter-keys-spec)
   })

(def catalogs-hotel-product-group-filters-all-of-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group-filters-all-of
     :spec catalogs-hotel-product-group-filters-all-of-data}))
