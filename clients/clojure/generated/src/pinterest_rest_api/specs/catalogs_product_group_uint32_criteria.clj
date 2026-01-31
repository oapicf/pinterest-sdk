(ns pinterest-rest-api.specs.catalogs-product-group-uint32-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-uint32-criteria-data
  {
   (ds/opt :negated) boolean?
   (ds/req :operator) string?
   (ds/req :value) int?
   })

(def catalogs-product-group-uint32-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-uint32-criteria
     :spec catalogs-product-group-uint32-criteria-data}))
