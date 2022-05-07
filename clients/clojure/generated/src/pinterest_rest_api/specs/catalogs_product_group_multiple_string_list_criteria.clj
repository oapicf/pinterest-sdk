(ns pinterest-rest-api.specs.catalogs-product-group-multiple-string-list-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-string-list-criteria-data
  {
   (ds/req :values) (s/coll-of (s/coll-of string?))
   (ds/req :negated) boolean?
   })

(def catalogs-product-group-multiple-string-list-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-string-list-criteria
     :spec catalogs-product-group-multiple-string-list-criteria-data}))
