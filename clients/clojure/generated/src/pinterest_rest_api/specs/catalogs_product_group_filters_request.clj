(ns pinterest-rest-api.specs.catalogs-product-group-filters-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            [pinterest-rest-api.specs.catalogs-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-filters-request-data
  {
   (ds/req :any_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   (ds/req :all_of) (s/coll-of catalogs-product-group-filter-keys-spec)
   })

(def catalogs-product-group-filters-request-spec
  (ds/spec
    {:name ::catalogs-product-group-filters-request
     :spec catalogs-product-group-filters-request-data}))
