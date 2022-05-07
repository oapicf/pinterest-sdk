(ns pinterest-rest-api.specs.catalogs-product-group-pricing-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-product-group-pricing-criteria-data
  {
   (ds/req :inclusion) boolean?
   (ds/req :values) float?
   (ds/req :negated) boolean?
   })

(def catalogs-product-group-pricing-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-pricing-criteria
     :spec catalogs-product-group-pricing-criteria-data}))
