(ns pinterest-rest-api.specs.catalogs-product-group-filters-request-any-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-filters-request-any-of-1-data
  {
   (ds/req :all_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   })

(def catalogs-product-group-filters-request-any-of-1-spec
  (ds/spec
    {:name ::catalogs-product-group-filters-request-any-of-1
     :spec catalogs-product-group-filters-request-any-of-1-data}))
