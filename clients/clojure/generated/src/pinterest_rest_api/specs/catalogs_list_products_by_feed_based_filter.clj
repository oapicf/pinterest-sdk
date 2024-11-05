(ns pinterest-rest-api.specs.catalogs-list-products-by-feed-based-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-product-group-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-list-products-by-feed-based-filter-data
  {
   (ds/req :feed_id) string?
   (ds/req :filters) catalogs-product-group-filters-spec
   })

(def catalogs-list-products-by-feed-based-filter-spec
  (ds/spec
    {:name ::catalogs-list-products-by-feed-based-filter
     :spec catalogs-list-products-by-feed-based-filter-data}))
