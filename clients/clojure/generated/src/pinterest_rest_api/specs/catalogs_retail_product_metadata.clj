(ns pinterest-rest-api.specs.catalogs-retail-product-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.non-nullable-product-availability-type :refer :all]
            [pinterest-rest-api.specs.non-nullable-catalogs-currency :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-product-metadata-data
  {
   (ds/req :item_id) string?
   (ds/req :item_group_id) string?
   (ds/req :availability) non-nullable-product-availability-type-spec
   (ds/req :price) float?
   (ds/req :sale_price) float?
   (ds/req :currency) non-nullable-catalogs-currency-spec
   })

(def catalogs-retail-product-metadata-spec
  (ds/spec
    {:name ::catalogs-retail-product-metadata
     :spec catalogs-retail-product-metadata-data}))
