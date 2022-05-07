(ns pinterest-rest-api.specs.catalogs-product-group-multiple-string-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-string-criteria-data
  {
   (ds/req :values) (s/coll-of string?)
   (ds/req :negated) boolean?
   })

(def catalogs-product-group-multiple-string-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-string-criteria
     :spec catalogs-product-group-multiple-string-criteria-data}))
