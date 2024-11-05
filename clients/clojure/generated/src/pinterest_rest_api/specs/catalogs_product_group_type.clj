(ns pinterest-rest-api.specs.catalogs-product-group-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-type-data
  {
   })

(def catalogs-product-group-type-spec
  (ds/spec
    {:name ::catalogs-product-group-type
     :spec catalogs-product-group-type-data}))
