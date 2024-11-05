(ns pinterest-rest-api.specs.catalogs-product-group-filters-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-filters-all-of-data
  {
   (ds/req :all_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   })

(def catalogs-product-group-filters-all-of-spec
  (ds/spec
    {:name ::catalogs-product-group-filters-all-of
     :spec catalogs-product-group-filters-all-of-data}))
