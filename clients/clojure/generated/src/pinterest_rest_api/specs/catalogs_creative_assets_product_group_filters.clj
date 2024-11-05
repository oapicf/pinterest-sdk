(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filter-keys :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-filters-data
  {
   (ds/req :any_of) (s/coll-of catalogs-creative-assets-product-group-filter-keys-spec)
   (ds/req :all_of) (s/coll-of catalogs-creative-assets-product-group-filter-keys-spec)
   })

(def catalogs-creative-assets-product-group-filters-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group-filters
     :spec catalogs-creative-assets-product-group-filters-data}))
