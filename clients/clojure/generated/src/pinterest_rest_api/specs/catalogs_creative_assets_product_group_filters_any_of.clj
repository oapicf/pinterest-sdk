(ns pinterest-rest-api.specs.catalogs-creative-assets-product-group-filters-any-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-creative-assets-product-group-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-product-group-filters-any-of-data
  {
   (ds/req :any_of) (s/coll-of catalogs-creative-assets-product-group-filter-keys-spec)
   })

(def catalogs-creative-assets-product-group-filters-any-of-spec
  (ds/spec
    {:name ::catalogs-creative-assets-product-group-filters-any-of
     :spec catalogs-creative-assets-product-group-filters-any-of-data}))
