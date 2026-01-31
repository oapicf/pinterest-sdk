(ns pinterest-rest-api.specs.catalogs-hotel-product-group-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-group-type-data
  {
   })

(def catalogs-hotel-product-group-type-spec
  (ds/spec
    {:name ::catalogs-hotel-product-group-type
     :spec catalogs-hotel-product-group-type-data}))
